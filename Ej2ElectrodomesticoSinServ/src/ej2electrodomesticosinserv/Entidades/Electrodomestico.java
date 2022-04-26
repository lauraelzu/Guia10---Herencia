/*
*************SUPERCLASE******************
 */
package ej2electrodomesticosinserv.Entidades;

import java.util.Scanner;

public class Electrodomestico {
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
        if(!color.equalsIgnoreCase("blanco")&&!color.equalsIgnoreCase("negro")&&
                !color.equalsIgnoreCase("rojo")&&!color.equalsIgnoreCase("azul")&&
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
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Electrodomestico e = new Electrodomestico();
        
        e.setPrecio(1000d); // Precio base
        
        System.out.println("=> Ingrese color del electrodoméstico (blanco/negro/rojo/azul/gris)");
        e.setColor(comprobarColor(leer.next()));
        
        System.out.println("=> Ingrese consumo energético del electrodoméstico (A a la F)");
        e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        
        System.out.println("=> Ingrese el peso del electrodoméstico en Kg");
        e.setPeso(leer.nextInt());
        
        return e;
    }
    
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. 
    */
    public void precioFinal(){
        Double aumento=0d;
        //según consumo
        switch (consumoEnergetico){
            case 'A':
                aumento=1000d;
                break;
            case 'B':
                aumento=800d;
                break;
            case 'C':
                aumento=600d;
                break;
            case 'D':
                aumento=500d;
                break;
            case 'E':
                aumento=300d;
                break;
            case 'F':
                aumento=100d;
                break;
        }
        //según peso
        if(peso<20){
            aumento+=100d;
        }else if(peso<50){
            aumento+=500d;
        }else if(peso<80){
            aumento+=800d;
        }else{
            aumento+=1000d;
        }
        
        setPrecio (aumento + precio); //precio base + aumento según peso y consumo
    }

    @Override
    public String toString() {
        return "precio= $" + precio + ", color=" + color + ", consumo energetico=" + consumoEnergetico + ", peso=" + peso + "Kg";
    }
    
    
}
