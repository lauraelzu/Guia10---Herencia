
package extra1puerto.Servicio;

import extra1puerto.Entidades.Alquiler;
import extra1puerto.Entidades.BarcoAMotor;
import extra1puerto.Entidades.Yate;
import java.util.Scanner;

public class YateServicio extends BarcoAMotorServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Yate crearYate(){
        BarcoAMotor bm = super.crearBarcoAMotor(); //////
        System.out.println("Ingrese la cantidad de camarotes");        
        return new Yate(leer.nextInt(), bm.getPotencia(), bm.getMatricula(), bm.getEslora(), bm.getAgnoDeFabricacion());
    }
    
     /*
        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes
        */
    
     public int calcularModulo(Yate y){
        return super.calcularModulo(y) + y.getNroCamarotes();
    }
}
