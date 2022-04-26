/*
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
*/
package ej1herencia.Entidades;

//clase abstracta ya que contiene al menos 1 método abstracto
public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    /*
    Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta
    */
    public abstract void alimentarse();
}
