package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Picotazo;
import mx.edu.itsur.pokebatalla.model.moves.GiroFuego;
import mx.edu.itsur.pokebatalla.model.moves.Malisioso;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import java.util.ArrayList;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Moltres extends Pokemon{
    
    public enum Movimientos {
        PICOTAZO,
        GIRO_FUEGO,
        MALISIOSO
        
    }
    public Moltres () {
        tipo = "FUEGO/VOLADOR";
        hp = 90;
        ataque = 100;
        defensa = 90;
        nivel = 1;
        precision = 5;
    }
    
        public Moltres (String nombre){
        this();
        this.nombre = nombre;
    }
    
public void atacar(Pokemon oponente, Moltres.Movimientos movimientoAUtilizar){
        Movimiento instanciaMovimiento;
        switch(movimientoAUtilizar) {
            case PICOTAZO:
                instanciaMovimiento = new Picotazo();
                break;
            case GIRO_FUEGO:
                instanciaMovimiento = new GiroFuego();
                break;
            case MALISIOSO:
                instanciaMovimiento = new Malisioso();
                break;
            
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
