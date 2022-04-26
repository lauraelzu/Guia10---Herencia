/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta
 */
package ej1herencia;

import ej1herencia.Entidades.Animal;
import ej1herencia.Entidades.Caballo;
import ej1herencia.Entidades.Gato;
import ej1herencia.Entidades.Perro;

public class Ej1Herencia {

    public static void main(String[] args) {
        
        //declaración objeto p1 tipo Animal
//        Animal p1= new Perro("Stich", "Carne", 15, "Caniche");

        //declaración objeto p1 tipo Perro
        Perro p1 = new Perro("Stich", "Carne", 15, "Caniche");
        
        p1.alimentarse();  //se obtiene igual resultado
        
        
        Animal g1 = new Gato("Minino", "leche", 2, "Siames");
        g1.alimentarse();
        Animal c1 = new Caballo("Trueno", "alfalfa", 10, "Pony");
        c1.alimentarse();
    }
    
}
