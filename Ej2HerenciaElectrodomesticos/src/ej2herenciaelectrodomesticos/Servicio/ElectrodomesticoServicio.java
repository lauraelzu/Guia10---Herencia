
package ej2herenciaelectrodomesticos.Servicio;

import ej2herenciaelectrodomesticos.Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
    */
    protected char comprobarConsumoEnergetico(char letra){
        if(letra > 'F'){
            return 'F';
        } else {
            return letra;
        }
    }
    
    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
    */
    protected String comprobarColor (String color){
        if(!color.equalsIgnoreCase("blanco")||!color.equalsIgnoreCase("negro")||
                !color.equalsIgnoreCase("rojo")||!color.equalsIgnoreCase("azul")||
                !color.equalsIgnoreCase("gris")){
            return "blanco";
        }else{
            return color;
        }
    }
    
    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
    */
    public Electrodomestico crearElectrodomestico(){
        Electrodomestico e = new Electrodomestico();
        
        e.setPrecio(1000d); //Al precio se le da un valor base de $1000.
        
        System.out.println("=> Ingrese color del electrodoméstico (blanco/negro/rojo/azul/gris)");
        e.setColor(comprobarColor(leer.next()));
        
        System.out.println("=> Ingrese consumo energético del electrodoméstico (A a la F)");
        e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0)));
        
        System.out.println("=> Ingrese el peso del electrodoméstico en Kg");
        e.setPeso(leer.nextInt());
        
        return e;
    }
    
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. 
    */
    public void calcularPrecioFinal(Electrodomestico e){
        Integer extra=0;
        switch (e.getConsumoEnergetico()){
            case 'A':
                extra=1000;
                break;
            case 'B':
                extra=800;
                break;
            case 'C':
                extra=600;
                break;
            case 'D':
                extra=500;
                break;
            case 'E':
                extra=300;
                break;
            case 'F':
                extra=100;
                break;
        }
        
        if(e.getPeso()>0 && e.getPeso()<20){
            extra+=100;
        }else if(e.getPeso()<50){
            extra+=500;
        }else if(e.getPeso()<80){
            extra+=800;
        }else{
            extra+=1000;
        }
        
        e.setPrecio(e.getPrecio() + extra);
    }
}
