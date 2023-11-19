package mx.edu.itsur.pokebatalla.model.Pokemons;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public abstract class Pokemon {

    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected int xp;
    
    
    Pokemon() {
    }

    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return this.hp;
    }
    
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    } 
    
    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);
    
    public abstract Enum[] getMovimiento();
        
    @Override
    public String toString() {
        
        return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + hp + "}";
    }
}
