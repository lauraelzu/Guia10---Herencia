/*
en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas
 */
package extra2edificio;

import extra2edificio.Entidades.Edificio;
import extra2edificio.Entidades.Polideportivo;
import extra2edificio.Entidades.EdificioOficinas;
import extra2edificio.Enumeraciones.TipoInstalacion;
import extra2edificio.Servicio.EdificioOficinasServicio;
import extra2edificio.Servicio.PolideportivoServicio;
import java.util.ArrayList;

public class Extra2Edificio {

   
    public static void main(String[] args) {
        ArrayList<Edificio> listaDeEdificios = new ArrayList();
        PolideportivoServicio ps = new PolideportivoServicio();
        EdificioOficinasServicio eos = new EdificioOficinasServicio();
        
        Polideportivo poli1 = new Polideportivo("Poli No1", TipoInstalacion.TECHADO, 20, 5, 20);
        Polideportivo poli2 = new Polideportivo("Poli No2", TipoInstalacion.ABIERTO, 30, 8, 30);
        
        listaDeEdificios.add(poli1);
        listaDeEdificios.add(poli2);
        
        listaDeEdificios.add(eos.crearEdifOfi());
        listaDeEdificios.add(eos.crearEdifOfi());
        
        
        for (Edificio aux : listaDeEdificios) {
            if( aux instanceof Polideportivo){
                System.out.println("");
                System.out.println("La superficie del " + ((Polideportivo) aux).getNombre() +
                        " es de " + ps.calcularSuperficie(aux));
                System.out.println("El volumen es de " + ps.calcularVolumen(aux));
              
            } else{
                System.out.println("");
                System.out.println("La superficie del edificio de oficinas es de " + eos.calcularSuperficie(aux));
                System.out.println("El volumen es de " + eos.calcularVolumen(aux));
                eos.calcularCantPersonas((EdificioOficinas)aux);
            }
            
        }
    }
    
}
