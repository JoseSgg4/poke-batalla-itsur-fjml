package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Ascuas;
import mx.edu.itsur.pokebatalla.model.moves.Cuchillada;
import mx.edu.itsur.pokebatalla.model.moves.Malisioso;
import mx.edu.itsur.pokebatalla.model.moves.LanzaLlamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Charizard extends Pokemon {
    
    public enum Movimientos {
        ASCUAS,
        CUCHILLADA,
        MALISIOSO,
        LANZA_LLAMAS
    }
        
    public Charizard() {
        this.tipo = "FUEGO/VOLADOR    ";
        this.hp = 359;
        this.ataque = 266;
        this.ataqueEsp = 268;
        this.defensa = 254;
        this.defensaEsp = 268;
        this.nivel = 84;
        this.precision = 4;
        vid = hp;
    }    
    
    public Charizard(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Charizard.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Charizard esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Charizard.Movimientos movimientoAUtilizar = Charizard.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case ASCUAS:
                instanciaMovimiento = new Ascuas();
                break;
            case CUCHILLADA:
                instanciaMovimiento = new Cuchillada();
                break;
            case MALISIOSO:
                instanciaMovimiento = new Malisioso();
                break;
            case LANZA_LLAMAS:
                instanciaMovimiento = new LanzaLlamas();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
    
}