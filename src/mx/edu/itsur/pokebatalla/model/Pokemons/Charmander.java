package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Grunido;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Charmander extends Pokemon {

    public enum Movimientos {
        ATAQUE_RAPIDO,
        GRUNIDO
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }

    public Charmander(String nombre) {
        this();
        this.nombre = nombre;
    }

    @Override
    public Enum[] getMovimiento() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Charmander esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case GRUNIDO:
                instanciaMovimiento = new Grunido();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
}