/*
 La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos 
 */
package extra2edificio.Servicio;

import extra2edificio.Entidades.Edificio;

public abstract class EdificioServicio {
    
       //***********metodos abstractos
    
    public abstract int calcularSuperficie(Edificio e);   
    
    public abstract int calcularVolumen(Edificio e); 
}
