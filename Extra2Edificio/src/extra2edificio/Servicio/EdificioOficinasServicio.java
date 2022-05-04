/*
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método calcularCantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
 */
package extra2edificio.Servicio;

import extra2edificio.Entidades.Edificio;
import extra2edificio.Entidades.EdificioOficinas;
import java.util.Scanner;

public class EdificioOficinasServicio extends EdificioServicio{
    
    Scanner leer = new Scanner(System.in);
    
    public EdificioOficinas crearEdifOfi(){
        System.out.println("Ingrese el ancho del edificio");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el alto del edificio");
        int alto = leer.nextInt();
        System.out.println("Ingrese el largo del edificio");
        int largo = leer.nextInt();
        System.out.println("Ingrese cuántas personas entran en cada oficina");
        int cantPers = leer.nextInt();
        System.out.println("Ingrese cantidad de oficinas por piso");
        int cantOfi = leer.nextInt();
        System.out.println("Ingrese cantidad de pisos");
        int cantPisos = leer.nextInt();

        return new EdificioOficinas(cantOfi, cantPers, cantPisos, ancho, alto, largo);
    }
    
      @Override
    public int calcularSuperficie(Edificio e) {
        return e.getLargo()*e.getAncho();
    }

    @Override
    public int calcularVolumen(Edificio e) {
        return calcularSuperficie(e)*e.getAlto();
    }
    
    public void calcularCantPersonas(EdificioOficinas e){
        int cantidad = e.getNroOficinas()*e.getCantPersxOficina();
        System.out.println("Cantidad de personas por piso " + cantidad);
        System.out.println("Cantidad total de personas " + cantidad*e.getNroPisos());
    }
    
}
