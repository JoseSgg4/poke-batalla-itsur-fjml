package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.PicoTaladro;
import mx.edu.itsur.pokebatalla.model.moves.Trueno;
import mx.edu.itsur.pokebatalla.model.moves.OndaTrueno;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Zapdos extends Pokemon{
    
        public enum Movimientos {
        PICO_TALADRO,
        TRUENO,
        ONDA_TRUENO 
    }
        
    public Zapdos() {
        tipo = "ELECTRICO/VOLADOR";
        hp = 90;
        ataque = 90;
        defensa = 75;
        nivel = 1;
        precision = 5;
    }
    
    public Zapdos(String nombre){
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
            System.out.println("Zapdos esta agotado y no puede realizar mas movimientos.");
            return;
        }
        
        Zapdos.Movimientos movimientoAUtilizar = Zapdos.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        
        switch(movimientoAUtilizar) {
            case PICO_TALADRO:
                instanciaMovimiento = new PicoTaladro();
                break;
            case TRUENO:
                instanciaMovimiento = new Trueno();
                break;
            case ONDA_TRUENO:
                instanciaMovimiento = new OndaTrueno();
                break;
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
