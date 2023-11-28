package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.DobleEquipo;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Rayo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Pikachu extends Pokemon {
    
    public enum Movimientos {
        ATAQUE_RAPIDO,
        DOBLE_EQUIPO,
        IMPACTRUENO,
        RAYO
    }
        
    public Pikachu() {
        this.tipo = "ELECTRICO        ";
        this.hp = 274;
        this.ataque = 229;
        this.ataqueEsp = 218;
        this.defensa = 196;
        this.defensaEsp = 218;
        this.nivel = 88;
        this.precision = 4;
        vid = hp;
    }    
    
    public Pikachu(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Pikachu.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case DOBLE_EQUIPO:
                instanciaMovimiento = new DobleEquipo();
                break;
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case RAYO:
                instanciaMovimiento = new Rayo();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
    
}