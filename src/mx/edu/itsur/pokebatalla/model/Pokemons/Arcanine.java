package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Ascuas;
import mx.edu.itsur.pokebatalla.model.moves.Derribo;
import mx.edu.itsur.pokebatalla.model.moves.RuedaFuego;
import mx.edu.itsur.pokebatalla.model.moves.Rugido;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Arcanine extends Pokemon {
    
    public enum Movimientos {
        ASCUAS,
        DERRIBO,
        RUEDA_FUEGO,
        RUGIDO
    }
        
    public Arcanine() {
        this.tipo = "FUEGO            ";
        this.hp = 3848;
        this.ataque = 350;
        this.ataqueEsp = 328;
        this.defensa = 284;
        this.defensaEsp = 284;
        this.nivel = 81;
        this.precision = 4;
        vid = hp;
    }    
    
    public Arcanine(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Arcanine.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Arcanine esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Arcanine.Movimientos movimientoAUtilizar = Arcanine.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case ASCUAS:
                instanciaMovimiento = new Ascuas();
                break;
            case DERRIBO:
                instanciaMovimiento = new Derribo();
                break;
            case RUEDA_FUEGO:
                instanciaMovimiento = new RuedaFuego();
                break;
            case RUGIDO:
                instanciaMovimiento = new Rugido();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
