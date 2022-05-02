/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo
 */
package extra1puerto.Entidades;

//corta la herencia
public final class Velero extends Barco{
    private Integer nroMastiles;

    public Velero() {
        super();
    }

    public Velero(Integer nroMastiles, String matricula, Integer eslora, Integer agnoDeFabricacion) {
        super(matricula, eslora, agnoDeFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero: " + super.toString() + ", nroMastiles=" + nroMastiles + '}';
    }
    
    @Override
    public int calcularModulos(){
        return super.calcularModulos() + nroMastiles;
    }
}
