package ej2electrodomesticosinserv.Entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico{
    
    private Integer carga;
    
    /*
    Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados.
    */

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
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
/*
     • Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
    */
     
    public Lavadora crearLavadora(){
        Scanner leer = new Scanner(System.in);
        Lavadora l = new Lavadora();
        Electrodomestico e = super.crearElectrodomestico();
        l.setPrecio(e.getPrecio());
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());
        System.out.println("=> Ingrese la carga permitida");
        l.setCarga(leer.nextInt());
        l.calcularPrecioFinal();
        return l;
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. 
    */
   
    @Override
    public void calcularPrecioFinal(){
        super.calcularPrecioFinal();  ///precio base + aumento según peso y consumo
        
        //agrega funcionalidad
        if(carga>30){
            setPrecio(getPrecio()+500d);
        }
        
    }

    @Override
    public String toString() {
        return "Lavadora: " + super.toString() + ", carga=" + carga + "Kg";
    }
    
    

}
