
package extra1puerto.Servicio;

import extra1puerto.Entidades.Alquiler;
import extra1puerto.Entidades.Barco;
import extra1puerto.Entidades.BarcoAMotor;
import extra1puerto.Entidades.Velero;
import java.util.Scanner;

public class VeleroServicio extends BarcoServicio{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Velero crearVelero(){
        Barco b = super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles");
               
        return new Velero(leer.nextInt(), b.getMatricula(), b.getEslora(), b.getAgnoDeFabricacion());
    }
    
     /*
        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes
        */
    
    public int calcularModulo(Velero v) {
        return super.calcularModulo(v) + v.getNroMastiles();
    }
}
