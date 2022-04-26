/*
*******************Herencia - Con Servicio********************
crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package ej2herenciaelectrodomesticos;

import ej2herenciaelectrodomesticos.Entidades.Lavadora;
import ej2herenciaelectrodomesticos.Entidades.Televisor;
import ej2herenciaelectrodomesticos.Servicio.LavadoraServicio;
import ej2herenciaelectrodomesticos.Servicio.TelevisorServicio;

public class Ej2HerenciaElectrodomesticos {

    public static void main(String[] args) {
        
        System.out.println("----------creando lavadora----------");
        LavadoraServicio ls = new LavadoraServicio();
        Lavadora l = ls.crearLavadora();
        System.out.println(l); //para control
        
        System.out.println("----------creando televisor----------");
        TelevisorServicio ts = new TelevisorServicio();
        Televisor tv = ts.crearTelevisor();
        System.out.println(tv); //para control
    }
    
}
