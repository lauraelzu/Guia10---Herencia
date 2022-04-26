/*
crear una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
 */
package ej2electrodomesticosinserv.Entidades;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {
    
    private Integer resolucion;
    private boolean sintonizador;

    /*
    Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
    */
    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    
   /*
    Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
    */ 
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
    */
    public Televisor crearTelevisor(){
        
        Scanner leer = new Scanner(System.in);
        Electrodomestico e = super.crearElectrodomestico(); //no necesita instanciar, crea y llena  
        
        System.out.println("=> Ingrese la resolución del televisor en pulgadas");
        Integer resol = leer.nextInt();
        System.out.println("=> Posee sintonizador TDT incorporado? (S/N)");
        boolean sint = false;
        if (leer.next().equalsIgnoreCase("S")){
            sint = true;
        }
        //OJO!!! no se puede llamar a calcularPrecioFinal en el constructor porque no se inicializaron todos los atrib.
        return new Televisor(resol, sint, e.getPrecio(), e.getColor(),e.getConsumoEnergetico(),e.getPeso());
    }
    /*
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
    */
    @Override
    public void calcularPrecioFinal(){
        super.calcularPrecioFinal(); //precio base + aumento según peso y consumo
        
        if (resolucion > 40){
            setPrecio(getPrecio()*1.3);
        }
        
        if (sintonizador){
            setPrecio(getPrecio()+500d);
        }
        
        
    }

    @Override
    public String toString() {
        return "Televisor: " + super.toString() + ", resolucion=" + resolucion + ", sintonizador=" + sintonizador;
    }
    
    
    
}
