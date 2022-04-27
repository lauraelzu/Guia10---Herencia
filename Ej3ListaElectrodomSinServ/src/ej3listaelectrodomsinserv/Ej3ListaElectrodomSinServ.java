/*
crear un ArrayList de Electrodomésticos para guardar 4 electrodomésticos, 
ya sean lavadoras o televisores, con valores ya asignados.
 */
package ej3listaelectrodomsinserv;

import ej3listaelectrodomsinserv.Entidades.Electrodomestico;
import ej3listaelectrodomsinserv.Entidades.Lavadora;
import ej3listaelectrodomsinserv.Entidades.Televisor;
import java.util.ArrayList;


public class Ej3ListaElectrodomSinServ {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        //Integer carga, Double precio, String color, char consumoEnergetico, Integer peso
        Lavadora l1 = new Lavadora(3, 5000d, "blanco", 'A', 30);
        Lavadora l2 = new Lavadora(12, 10000d, "rojo", 'C', 40);
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        
        //Integer resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, Integer peso
        Televisor tv1 = new Televisor(40, true, 40000d, "negro", 'A', 6);
        Televisor tv2 = new Televisor(20, false, 8000d, "negro", 'C', 3);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        
        /*
        recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras
        */
        System.out.println("---------------Lista de precios-----------------");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.calcularPrecioFinal();
            System.out.println(electrodomestico.toString());
        }
        
        /*
        mostrar, la suma del precio de los Electrodomésticos por tipo
        */
        System.out.println("---Suma del precio de los electrodomésticos por tipo---");
        Double sumatv = 0d;
        Double sumalav = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora){
                sumalav += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Televisor){
                sumatv += electrodomestico.getPrecio();
            }  
        }
        System.out.println("Precio Total Lavadoras: $" + sumalav);
        System.out.println("Precio Total Televisores: $" + sumatv);
        
        
        
        /*
        mostrar, la suma del precio de todos los Electrodomésticos
        */
        System.out.println("---Suma del precio de todos los electrodomésticos---");
        Double suma = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            suma += electrodomestico.getPrecio();
        }
        System.out.println("Precio Total: $" + suma);
        

    }
    
}
