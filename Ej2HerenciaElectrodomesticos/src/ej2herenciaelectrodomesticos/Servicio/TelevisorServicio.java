package ej2herenciaelectrodomesticos.Servicio;

import ej2herenciaelectrodomesticos.Entidades.Electrodomestico;
import ej2herenciaelectrodomesticos.Entidades.Televisor;
import java.util.Scanner;

//******subclase TelevisorServicio ES un tipo DE superclase ElectrodomesticoServicio
public class TelevisorServicio extends ElectrodomesticoServicio{
    
    Scanner leer = new Scanner(System.in);
    
      /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
    */
    public Televisor crearTelevisor(){
               
        //llenar lo general
        Electrodomestico e = super.crearElectrodomestico(); //no necesita instanciar, crea y llena  
        Televisor tv = new Televisor();
        tv.setColor(e.getColor());
        tv.setConsumoEnergetico(e.getConsumoEnergetico());
        tv.setPeso(e.getPeso());
        //llenar particularidades
        System.out.println("=> Ingrese la resolución del televisor en pulgadas");
        tv.setResolucion(leer.nextInt());
        System.out.println("=> Posee sintonizador TDT incorporado? (S/N)");
        if (leer.next().equalsIgnoreCase("S")){
            tv.setSintonizador(true);
        }else {
            tv.setSintonizador(false);
        }
        calcularPrecioFinal(e, tv); //actualizar precio según resolución y sintonizador
        return tv;
    }
    
    /*
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
    */
    
    
    public void calcularPrecioFinal(Electrodomestico e, Televisor tv){
        super.calcularPrecioFinal(e); //precio base + aumento según peso y consumo
        
        if (tv.getResolucion() > 40){
            tv.setPrecio(e.getPrecio()*1.3);
        }
        
        if (tv.isSintonizador()){
            tv.setPrecio(tv.getPrecio()+500d);  //*************tv.getPrecio()
        }
    }
        
}
