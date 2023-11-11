package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Entrenador {
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
    
    public void capturarPokemon(Pokemon p){
        pokemonsCapturados.add(p);
    }
    
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordianlMovimiento){
    }
    
    public boolean estaDerotado(){
        return true;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
        this.pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }
}
