/*
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
 */
package extra1puerto.Servicio;

import extra1puerto.Entidades.Alquiler;
import extra1puerto.Entidades.Barco;
import extra1puerto.Entidades.BarcoAMotor;
import extra1puerto.Entidades.Velero;
import extra1puerto.Entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class AlquilerServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void menu(){
        
        Alquiler a = new Alquiler();
        System.out.println("-------Alquiler de amarre-----------");
        
        System.out.println("=>Ingrese nombre del cliente");
        a.setNombreCliente(leer.next());
        System.out.println("=>Ingrese su DNI");
        a.setDnicliente(leer.nextInt());
        System.out.println("=>Fecha de alquiler: Ingrese día, número de mes y año");
        Date fechaAlq = new Date();
        fechaAlq.setDate(leer.nextInt());
        fechaAlq.setMonth(leer.nextInt()-1);
        fechaAlq.setYear(leer.nextInt()-1900);
        a.setFechaAlquiler(fechaAlq);
        System.out.println("=>Fecha de devolución: Ingrese día, número de mes y año");
        Date fechaDev = new Date();
        fechaDev.setDate(leer.nextInt());
        fechaDev.setMonth(leer.nextInt()-1);
        fechaDev.setYear(leer.nextInt()-1900);
        a.setFechaDevolucion(fechaDev);
        System.out.println("Ingrese posiciónde amarre");
        a.setPosicionAmarre(leer.next());
        submenu(a);
        
    }
        
    public void submenu(Alquiler a){
        
        System.out.println("=>Ingrese tipo de barco:");
        System.out.println("1. Barco a motor");
        System.out.println("2. Yate");
        System.out.println("3. Velero");
        System.out.println("4. Otro");
        
       int modulos = 0;
        
        switch (leer.nextInt()){
            case 1:
                BarcoAMotorServicio bms = new BarcoAMotorServicio();
                BarcoAMotor bm = bms.crearBarcoAMotor();
                a.setBarco(bm);
                break;
            case 2:
                YateServicio ys = new YateServicio();
                Barco y = ys.crearYate();         /////////
                a.setBarco(y);
                break;
            case 3:
                VeleroServicio vs = new VeleroServicio();
                Velero v = vs.crearVelero();
                a.setBarco(v);
                break;
            case 4:
                BarcoServicio bs = new BarcoServicio ();
                Barco b = bs.crearBarco();
                a.setBarco(b);
                break;
            default:
                System.out.println("Opción no válida");
                submenu(a);  //vuele a pedir 1, 2 o 3
        }
        System.out.println("Costo final= $" + a.calcularCostoAlquiler());
    }
 
    

}
