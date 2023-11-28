package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Atizar extends MovimientoFisico{
    
    public Atizar() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 80;
        this.precision = 75;
        this.puntosPoder = 20;
    }
}
