/*
Clase EdificioOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
*/
package extra2edificio.Entidades;

public class EdificioOficinas extends Edificio{
    private int nroOficinas;
    private int cantPersxOficina;
    private int nroPisos;

    public EdificioOficinas() {
        super();
    }

    public EdificioOficinas(int nroOficinas, int cantPersxOficina, int nroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersxOficina = cantPersxOficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersxOficina() {
        return cantPersxOficina;
    }

    public void setCantPersxOficina(int cantPersxOficina) {
        this.cantPersxOficina = cantPersxOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return "EdificioOficinas{" + super.toString() + "nroOficinas=" + nroOficinas + ", cantPersxOficina=" + cantPersxOficina + ", nroPisos=" + nroPisos + '}';
    }
    
    
}
