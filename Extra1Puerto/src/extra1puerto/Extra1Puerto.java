/*
En un puerto se alquilan amarres para barcos de distinto tipo.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.
 */
package extra1puerto;

import extra1puerto.Servicio.AlquilerServicio;

public class Extra1Puerto {

    public static void main(String[] args) {
        AlquilerServicio as = new AlquilerServicio();
        as.menu();
        
    }
    
}
