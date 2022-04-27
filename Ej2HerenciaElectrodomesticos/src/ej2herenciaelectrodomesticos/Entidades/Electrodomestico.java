/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
 */
package ej2herenciaelectrodomesticos.Entidades;

public class Electrodomestico {
    //protected para que sólo las clases hijas accedan a estos atributos
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    /*
    Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
    */
    public Electrodomestico() {
         this.precio = 1000d; //precio base <<<<<=========
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
   
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    /*
    ***************Los métodos a implementar son:************
    
• Métodos getters y setters de todos los atributos. 
               "Si no son accedidos por clases que NO son hijas 
                se pueden obviar los GETTER y SETTER en la superclase"
    */
    public Double getPrecio() {
        return precio;
    }

    //
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    //
    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio= $" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }
    
    
    
    

}
