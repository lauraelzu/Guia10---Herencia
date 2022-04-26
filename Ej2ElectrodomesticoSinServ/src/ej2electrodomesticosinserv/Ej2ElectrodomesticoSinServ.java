/*
Crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package ej2electrodomesticosinserv;

import ej2electrodomesticosinserv.Entidades.Lavadora;
import ej2electrodomesticosinserv.Entidades.Televisor;
//import ej2electrodomesticosinserv.Entidades.Televisor;

public class Ej2ElectrodomesticoSinServ {

    public static void main(String[] args) {
        
//        System.out.println("--------creando lavadora---------------");
//        Lavadora l = new Lavadora();
//        l=l.crearLavadora();
//        System.out.println(l);
//        System.out.println("Precio final de la Lavadora: $" + l.getPrecio());
        
        System.out.println("--------creando TV---------------");
        Televisor tv = new Televisor();
        tv = tv.crearTelevisor();
        tv.precioFinal();   //actualiza el precio porque en la clase no se donde mierda vva
        System.out.println(tv);
        System.out.println("Precio final del televisor: $" + tv.getPrecio());
    }
    
}
