package ej2herenciaelectrodomesticos.Servicio;

import ej2herenciaelectrodomesticos.Entidades.Electrodomestico;
import ej2herenciaelectrodomesticos.Entidades.Lavadora;
import java.util.Scanner;

//******subclase LavadoraServicio ES un tipo DE superclase ElectrodomesticoServicio
public class LavadoraServicio extends ElectrodomesticoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
    */
    public Lavadora crearLavadora(){
        
        //llenar lo general
        Electrodomestico e = super.crearElectrodomestico(); //no hace falta instanciar(se hereda)
        Lavadora l = new Lavadora();
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());
        //llenar las particularidades
        System.out.println("=> Ingrese la carga permitida");
        l.setCarga(leer.nextInt());
        calcularPrecioFinal(e, l); //actualizar precio según carga permitida
        return l;
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
    */
    public void calcularPrecioFinal(Electrodomestico e, Lavadora l){
        super.calcularPrecioFinal(e);
        
         //agrega funcionalidad
        if(l.getCarga()>30){
            l.setPrecio(e.getPrecio()+500d);
        }
    }
}
