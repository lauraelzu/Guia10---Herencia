/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo
 */
package extra1puerto.Entidades;

//heredará a Yate
public class BarcoAMotor extends Barco{
    private Integer potencia;

    public BarcoAMotor() {
        super();
    }

    public BarcoAMotor(Integer potencia, String matricula, Integer eslora, Integer agnoDeFabricacion) {
        super(matricula, eslora, agnoDeFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoAMotor: " + super.toString() + ", potencia=" + potencia + " CV";
    }
    
    @Override
    public int calcularModulos(){
        return super.calcularModulos() + potencia;
    }
}
