package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.model.Pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.Pokemons.Articuno;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemons.Moltres;
import mx.edu.itsur.pokebatalla.model.Pokemons.Zapdos;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hello PokeBatall!");
        
        Pikachu pika = new Pikachu();
        Charmander charma = new Charmander();
        Bullbasaur bullba = new Bullbasaur();
        Articuno articu = new Articuno();
        Moltres molt = new Moltres();
        Zapdos zapd = new Zapdos();
        
        Entrenador ent1 = new Entrenador("May");
        ent1.capturarPokemon(articu);
        ent1.capturarPokemon(molt);
        ent1.capturarPokemon(zapd);
        
        Entrenador ent2 = new Entrenador("Red");
        ent2.capturarPokemon(pika);
        ent2.capturarPokemon(bullba);
        ent2.capturarPokemon(charma);

        Batalla b = new Batalla(ent1, ent2);
        b.desarrollarBatalla();

    }
}
    

