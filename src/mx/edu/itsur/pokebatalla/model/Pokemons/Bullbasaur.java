package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Bullbasaur extends Pokemon {

    public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    public Bullbasaur(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Bullbasaur.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Bullbasaur esta agotado y no puede realizar mas movimientos.");
            return;
        }    
        
        Bullbasaur.Movimientos movimientoAUtilizar = Bullbasaur.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {
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
