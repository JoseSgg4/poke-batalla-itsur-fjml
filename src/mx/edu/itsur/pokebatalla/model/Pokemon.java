package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.util.List;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<String> habilidades;
    
    
    Pokemon() {
    }
    
    //Getters
    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }
    
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //Métodos
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    } 
    
        @Override
    public String toString() {

        return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + hp + "}";
    }

    public void atacar(Pokemon oponente) {
        System.out.println("-----------------------------------------");
        System.out.println("Batalla 1");
        System.out.println("Mi pokemon:" + this.nombre);
        System.out.println("esta atacando a: " + oponente);
        
        if (this.ataque > oponente.defensa) {
            //Calcular el daño
            int damage = this.ataque - oponente.defensa;
            //Restar el daño del HP del oponente
            oponente.hp = oponente.hp - damage;
            System.out.println("Y le causo un daño de: " + damage);
        }else{
            
           //TODO: ...Y si no que pasa?
        }
        System.out.println("El pokemon oponente quedo asi:" + oponente);

        
        
        //System.out.println("Pokemon Atacando a un: " + enemigo.getClass().getName());
        //TODO: Aqui va la logica para causar daño al enemigo.

    }
    


    public void atacar1(Pokemon oponente1){
        System.out.println("-----------------------------------------");
        System.out.println("Batalla 2");
        System.out.println("Mi pokemon:" + this.nombre);
        System.out.println("esta atacando a: " + oponente1);
        
        if (this.ataque > oponente1.defensa) {
            //Calcular el daño
            int damage = this.ataque - oponente1.defensa;
            //Restar el daño del HP del oponente
            oponente1.hp = oponente1.hp - damage;
            System.out.println("Y le causo un daño de: " + damage);
        }else{
            
           //TODO: ...Y si no que pasa?
        }
        System.out.println("El pokemon oponente quedo asi:" + oponente1);
    }

    public void atacar2(Pokemon oponente2){
        System.out.println("-----------------------------------------");
        System.out.println("Batalla 3");
        System.out.println("Mi pokemon:" + this.nombre);
        System.out.println("esta atacando a: " + oponente2);
        
        if (this.ataque > oponente2.defensa) {
            //Calcular el daño
            int damage = this.ataque - oponente2.defensa;
            //Restar el daño del HP del oponente
            oponente2.hp = oponente2.hp - damage;
            System.out.println("Y le causo un daño de: " + damage);
        }else{
            
           //TODO: ...Y si no que pasa?
        }
        System.out.println("El pokemon oponente quedo asi:" + oponente2);
        
    }
}
