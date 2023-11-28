package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Agilidad;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueAla;
import mx.edu.itsur.pokebatalla.model.moves.Atizar;
import mx.edu.itsur.pokebatalla.model.moves.Hiperrayo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Dragonite extends Pokemon {
    
    public enum Movimientos {
        AGILIDAD,
        ATAQUE_ALA,
        ATIZAR,
        HIPERRAYO
    }
        
    public Dragonite() {
        this.tipo = "DRAGON/VOLADOR   ";
        this.hp = 386;
        this.ataque = 403;
        this.ataqueEsp = 328;
        this.defensa = 317;
        this.defensaEsp = 328;
        this.nivel = 85;
        this.precision = 4;
        vid = hp;
    }    
    
    public Dragonite(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Dragonite.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Dragonite esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Dragonite.Movimientos movimientoAUtilizar = Dragonite.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case AGILIDAD:
                instanciaMovimiento = new Agilidad();
                break;
            case ATAQUE_ALA:
                instanciaMovimiento = new AtaqueAla();
                break;
            case ATIZAR:
                instanciaMovimiento = new Atizar();
                break;
            case HIPERRAYO:
                instanciaMovimiento = new Hiperrayo();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
