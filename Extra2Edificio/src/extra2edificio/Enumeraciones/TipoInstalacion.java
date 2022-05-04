/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2edificio.Enumeraciones;

public enum TipoInstalacion {
    TECHADO("Techado"), ABIERTO("Abierto");
    
    private String tipo;

    private TipoInstalacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
