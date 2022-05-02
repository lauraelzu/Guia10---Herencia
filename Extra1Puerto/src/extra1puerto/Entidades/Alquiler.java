/*
Para cada Alquiler se guarda: el nombre, documento del cliente, 
la fecha de alquiler, fecha de devolución, la posición del amarre 
y el barco que lo ocupará.
 */
package extra1puerto.Entidades;

import java.util.Date;

public class Alquiler {
    private String nombreCliente;
    private Integer dnicliente;
    private Date fechaAlquiler;   
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer dnicliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dnicliente = dnicliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(Integer dnicliente) {
        this.dnicliente = dnicliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dnicliente=" + dnicliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    public int calcularCostoAlquiler(){
                       
        int cantDias = (int)(getFechaDevolucion().getTime() - getFechaAlquiler().getTime()); //en milisegundos
        cantDias = cantDias/(1000*60*60*24); //en días
        
        return cantDias * getBarco().calcularModulos();
    
    }
    
}
