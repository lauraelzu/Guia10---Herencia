package extra1puerto.Servicio;

import extra1puerto.Entidades.Alquiler;
import extra1puerto.Entidades.Barco;
import extra1puerto.Entidades.BarcoAMotor;
import java.util.Scanner;

public class BarcoAMotorServicio extends BarcoServicio{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
      
    public BarcoAMotor crearBarcoAMotor() {
        Barco b = super.crearBarco(); //////
        System.out.println("Ingrese la potencia en CV");
        BarcoAMotor bm = new BarcoAMotor(leer.nextInt(), b.getMatricula(), b.getEslora(), b.getAgnoDeFabricacion());
        
        return bm;
    }
    
     /*
        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes
        */
    
    
    public int calcularModulo(BarcoAMotor bm){
        return super.calcularModulo(bm) + bm.getPotencia();   ////
    }
    
}
