/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
 */
package extra2edificio.Entidades;

import extra2edificio.Enumeraciones.TipoInstalacion;

public class Polideportivo extends Edificio{
    private String nombre;
    private TipoInstalacion tipoInstalacion;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, TipoInstalacion tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }

   
    
    
  
    
    
    
}
