/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo
 */
package extra1puerto.Entidades;

//corta la herencia
public final class Yate extends BarcoAMotor{
    private Integer nroCamarotes;

    public Yate() {
        super();
    }

    public Yate(Integer nroCamarotes, Integer potencia, String matricula, Integer eslora, Integer agnoDeFabricacion) {
        super(potencia, matricula, eslora, agnoDeFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate: " + super.toString()+ ", nroCamarotes=" + nroCamarotes + '}';
    }
    
    @Override
    public int calcularModulos(){
        return super.calcularModulos() + nroCamarotes;
    }
}
