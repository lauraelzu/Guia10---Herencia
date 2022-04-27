package ej4formasinterface.Entidades;

import ej4formasinterface.Interfaz.calculosFormas;

//clase que implementa a la interfaz calculoFormas
public class Circulo implements calculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    //*********implementaciones de los métodos de la interfaz************
    @Override
    public double calcularArea() {      
         return (Math.PI * radio * radio);
    }

    @Override
    public double calcularPermitro() {
        return (Math.PI * 2 * radio);
    }
    
    
}
