package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class GolpeCuerpo extends MovimientoFisico{
    
    public GolpeCuerpo() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 85;
        this.precision = 100;
        this.puntosPoder = 15;
    }
        
}