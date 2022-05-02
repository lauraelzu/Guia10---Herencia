/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
 */
package extra1puerto.Entidades;

public class Barco {             
    protected String matricula;
    protected Integer eslora;
    protected Integer agnoDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer agnoDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.agnoDeFabricacion = agnoDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAgnoDeFabricacion() {
        return agnoDeFabricacion;
    }

    public void setAgnoDeFabricacion(Integer agnoDeFabricacion) {
        this.agnoDeFabricacion = agnoDeFabricacion;
    }

    @Override
    public String toString() {
        return "matrícula=" + matricula + ", eslora=" + eslora + "m, agnoDeFabricacion=" + agnoDeFabricacion;
    }
    
    public int calcularModulos() {
        return eslora * 10;
    }
    
    
}
