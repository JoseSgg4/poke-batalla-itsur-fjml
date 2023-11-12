package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.Pokemons.Articuno;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemons.Moltres;
import mx.edu.itsur.pokebatalla.model.Pokemons.Zapdos;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pika = new Pikachu();
        Charmander charma = new Charmander();
        Bullbasaur bullba = new Bullbasaur();
        Articuno articu = new Articuno();
        Moltres molt = new Moltres();
        Zapdos zapd = new Zapdos();
        
        System.out.println("Nueva Batalla Pokemon! --------------------------------");
        System.out.println("");
        System.out.println("Aperecio un Charmander salvaje!");
        System.out.println("Adelante, Pikachu!");
        System.out.println("");
        pika.atacar(charma, Pikachu.Movimientos.IMPACTRUENO.ordinal());
        System.out.println("->Charmander utiliza");
        charma.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullba.atacar(charma, Bullbasaur.Movimientos.LATIGO.ordinal()); 
        
        System.out.println("");
        System.out.println("Nueva Batalla Pokemon! --------------------------------");
        System.out.println("");
        System.out.println("Aperecio un Charmander salvaje!");
        System.out.println("Adelante, Articuno!");
        System.out.println("");
        System.out.println("Articuno uso!");
        articu.atacar(charma, Articuno.Movimientos.RAYO_HIELO.ordinal());
        System.out.println("");
        System.out.println("Charmander uso!");
        charma.atacar(articu, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());
        System.out.println("");
        System.out.println("Articuno uso!");
        articu.atacar(charma, Articuno.Movimientos.ATAQUE_AEREO.ordinal());
        System.out.println("");
        System.out.println("Charmander uso!");
        charma.atacar(articu, Charmander.Movimientos.GRUNIDO.ordinal());
        System.out.println("");
        System.out.println("Articuno uso!");
        articu.atacar(charma, Articuno.Movimientos.SUSTITUTO.ordinal());
        System.out.println("");
        System.out.println("Charmander uso!");
        charma.atacar(articu, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());
        System.out.println("");
        System.out.println("Articuno uso!");
        articu.atacar(charma, Articuno.Movimientos.RAYO_HIELO.ordinal());
        System.out.println("");
        charma.atacar(articu, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());
        articu.atacar(charma, Articuno.Movimientos.RAYO_HIELO.ordinal());
        System.out.println("");
        System.out.println("La batalla a finalizado!");
    }
}
