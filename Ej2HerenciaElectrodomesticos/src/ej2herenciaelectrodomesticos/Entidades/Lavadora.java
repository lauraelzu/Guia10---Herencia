/*
crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
 */
package ej2herenciaelectrodomesticos.Entidades;

//final para cortar la herencia
//extends porque Lavadora ES un tipo DE Electrodomestico
public final class Lavadora extends Electrodomestico {
 
    private Integer carga;
    
    /*
    Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados.
    */
    
    public Lavadora() {
        super();  //hereda constructor vacío del padre
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);  //hereda constructor parametrizado del padre
        this.carga = carga;
    }
    
    /*
    ************************ Los métodos que se implementara serán:
• Método get y set del atributo carga.
    */

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    
        //llama al toString de la superclase
    @Override
    public String toString() {
        return "Lavadora: " + super.toString() + ", carga=" + carga;
    }

    
    
    

}
