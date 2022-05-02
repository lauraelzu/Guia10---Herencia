
package extra1puerto.Servicio;

import extra1puerto.Entidades.Alquiler;
import extra1puerto.Entidades.Barco;
import java.util.Date;
import java.util.Scanner;

public class BarcoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    
    public Barco crearBarco(){
             
        System.out.println("Ingrese la matrícula");
        String matricula = leer.next();
        System.out.println("Ingrese los metros de eslora");
        Integer eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricación");
        Integer agnofabri = leer.nextInt();
        
       return new Barco(matricula, eslora, agnofabri);
    }
    
     /*
        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes
        */
    public int calcularModulo(Barco b){
        return 10 * b.getEslora();   /////////////////////
    }
       
}
