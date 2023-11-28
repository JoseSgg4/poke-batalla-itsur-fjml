package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Canto;
import mx.edu.itsur.pokebatalla.model.moves.GolpeCuerpo;
import mx.edu.itsur.pokebatalla.model.moves.HidroBomba;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Lapras extends Pokemon {
    
    public enum Movimientos {
        CANTO,
        GOLPE_CUERPO,
        HIDROBOMBA,
        PISTOLA_AGUA
    }
        
    public Lapras() {
        this.tipo = "AGUA/HIELO       ";
        this.hp = 464;
        this.ataque = 295;
        this.ataqueEsp = 295;
        this.defensa = 284;
        this.defensaEsp = 317;
        this.nivel = 80;
        this.precision = 4;
        vid = hp;
    }    
    
    public Lapras(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Lapras.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Lapras esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Lapras.Movimientos movimientoAUtilizar = Lapras.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case CANTO:
                instanciaMovimiento = new Canto();
                break;
            case GOLPE_CUERPO:
                instanciaMovimiento = new GolpeCuerpo();
                break;
            case HIDROBOMBA:
                instanciaMovimiento = new HidroBomba();
                break;
            case PISTOLA_AGUA:
                instanciaMovimiento = new PistolaAgua();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
