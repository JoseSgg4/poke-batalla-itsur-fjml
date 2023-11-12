package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueAereo;
import mx.edu.itsur.pokebatalla.model.moves.RayoHielo;
import mx.edu.itsur.pokebatalla.model.moves.Sustituto;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Articuno extends Pokemon{

    public enum Movimientos {
        RAYO_HIELO,
        ATAQUE_AEREO,
        SUSTITUTO
    }
        
    public Articuno() {
        tipo = "HIELO/VOLADOR";
        hp = 90;
        ataque = 85;
        defensa = 75;
        nivel = 1;
        precision = 5;
    }
    
        public Articuno (String nombre){
        this();
        this.nombre = nombre;
    }
        
    @Override
    public Enum[] getMovimiento() {
        return Articuno.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Articuno esta agotado y no puede realizar mas movimientos.");
            return;
        }
        
        Articuno.Movimientos movimientoAUtilizar = Articuno.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch(movimientoAUtilizar) {
            case RAYO_HIELO:
                instanciaMovimiento = new RayoHielo();
                break;
            case ATAQUE_AEREO:
                instanciaMovimiento = new AtaqueAereo();
                break;
            case SUSTITUTO:
                instanciaMovimiento = new Sustituto();
                break;
            default:
                throw new AssertionError();
        }
        
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
