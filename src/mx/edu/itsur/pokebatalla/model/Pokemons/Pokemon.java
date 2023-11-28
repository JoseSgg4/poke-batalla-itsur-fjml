package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public abstract class Pokemon implements Serializable {

    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int ataqueEsp;
    protected int defensa;
    protected int defensaEsp;
    protected double precision;
    protected int xp;
    protected int xpNecesaria;
    protected int vid;
    
    Pokemon() {
    }
    public void ganarExperiencia(int experienciaGanada){
        xp += experienciaGanada;
        if(xp >= xpNecesaria){
            subirNivel();
        }
    }
    
    private void subirNivel(){
        nivel++;
        ataque += 5;
        defensa += 5;
        xpNecesaria += 50;
        xp = 0;
        vid += 10; 
        
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

    public int getAtaqueEsp() {
        return ataqueEsp;
    }

    public int getDefensaEsp() {
        return defensaEsp;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
       return this.nombre;
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public int nivel(){
        return this.nivel;
    }
    
    public int vid(){
        return this.vid;
    }
    
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    } 
    
    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);
    
    public abstract Enum[] getMovimiento();
    
         
    @Override
    public String toString() { 
        return this.getNombre() + "   NIVEL " + nivel +" \n"
                + tipo + "   HP:" + hp +"/" + vid;
    }
    
}
