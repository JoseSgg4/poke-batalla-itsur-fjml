package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Pikachu extends Pokemon {
    
    public enum Movimientos {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        LATIGO
    }
        
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
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
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }

}