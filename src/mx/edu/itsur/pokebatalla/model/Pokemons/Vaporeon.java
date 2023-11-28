package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.HidroBomba;
import mx.edu.itsur.pokebatalla.model.moves.Niebla;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Vaporeon extends Pokemon{
    
    public enum Movimientos {
        ATAQUE_RAPIDO,
        HIDROBOMBA,
        NIEBLA,
        PISTOLA_AGUA
    }
    
    public Vaporeon(){
        this.tipo = "AGUA             ";
        this.hp = 464;
        this.ataque = 251;
        this.ataqueEsp = 350;
        this.defensa = 240;
        this.defensaEsp = 317;
        this.nivel = 91;
        this.precision = 5;
        vid = hp;
    }
    
    public Vaporeon(String nombre){
        this();
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimiento() {
        return Vaporeon.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        Vaporeon.Movimientos movimientoAUtilizar = Vaporeon.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        
        switch(movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case HIDROBOMBA:
                instanciaMovimiento = new HidroBomba();
                break;
            case NIEBLA:
                instanciaMovimiento = new Niebla();
                break;
            case PISTOLA_AGUA:
                instanciaMovimiento = new PistolaAgua();
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}