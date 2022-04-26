/*
cada clase hija deberá mostrar luego un mensaje por pantalla 
informando de que se alimenta
 */
package ej1herencia.Entidades;

public final class Perro extends Animal {

    //no tiene atributos propios de la subclase
    
    //constructor
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    @Override
    public void alimentarse() {
        System.out.println(nombre + " es un perro y se alimenta de " + alimento);  
    }
    
}
