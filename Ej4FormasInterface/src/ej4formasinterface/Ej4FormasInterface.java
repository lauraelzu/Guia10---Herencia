/*
Crear un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ej4formasinterface;

import ej4formasinterface.Entidades.Circulo;
import ej4formasinterface.Entidades.Rectangulo;
import java.util.Scanner;

public class Ej4FormasInterface {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la medida del radio de un círculo");
        Circulo c = new Circulo(leer.nextDouble());
        System.out.println("El área del cículo es: " + c.calcularArea());
        System.out.println("El perímetro del cículo es: " + c.calcularPermitro());
        
        System.out.println("\nIngrese la medida de alto y el ancho de un rectángulo");
        Rectangulo r = new Rectangulo(leer.nextDouble(), leer.nextDouble());
        System.out.println("El área del rectángulo es: " + r.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + r.calcularPermitro());
    }
    
}
