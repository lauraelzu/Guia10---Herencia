package ej2herenciaelectrodomesticos.Entidades;

public class Televisor extends Electrodomestico {
      
    private Integer resolucion;
    private boolean sintonizador;

    /*
    Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
    */

    public Televisor() {
        super();  //hereda constructor vacío del padre
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

    
    //llama al toString de la superclase
    @Override
    public String toString() {
        return "Televisor: " + super.toString()+ ", resolucion=" + resolucion + ", sintonizador=" + sintonizador;
    }

    
    
    
    


    
    
    
}
