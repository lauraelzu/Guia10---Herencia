//esta clase implementará los dos métodos abstractos del padre.

package extra2edificio.Servicio;

import extra2edificio.Entidades.Edificio;


public class PolideportivoServicio extends EdificioServicio{

    
     //se agrega la funcionalidad a los métodos heredados de Edificio

    @Override
    public int calcularSuperficie(Edificio e) {
        return e.getLargo()*e.getAncho();
    }

    @Override
    public int calcularVolumen(Edificio e) {
        return calcularSuperficie(e)*e.getAlto();
    }
    
    
    
   
    
}
