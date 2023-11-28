package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class HidroBomba extends MovimientoEspecial{
    
    public HidroBomba() {
        this.tipo=TiposDeMovimiento.AGUA;
        this.potencia = 110;
        this.precision = 80;
        this.puntosPoder = 5;
    }
    
}
