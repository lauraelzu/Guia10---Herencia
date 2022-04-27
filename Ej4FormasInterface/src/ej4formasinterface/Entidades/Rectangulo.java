
package ej4formasinterface.Entidades;

import ej4formasinterface.Interfaz.calculosFormas;

//clase que implementa a la interfaz calculosFormas
public class Rectangulo implements calculosFormas{
    
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
    //**********implementaciones de lso métodos**********

    @Override
    public double calcularArea() {
         return (alto * ancho);       
    }

    @Override
    public double calcularPermitro() {
        return (alto + ancho)*2;
    }
    
}
