package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class RuedaFuego extends MovimientoEspecial{
    
    public RuedaFuego() {
        this.tipo=Movimiento.TiposDeMovimiento.FUEGO;
        this.potencia = 60;
        this.precision = 100;
        this.puntosPoder = 25;
    }
}