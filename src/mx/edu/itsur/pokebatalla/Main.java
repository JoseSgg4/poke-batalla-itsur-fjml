package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Pokemons.Arcanine;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charizard;
import mx.edu.itsur.pokebatalla.model.Pokemons.Dragonite;
import mx.edu.itsur.pokebatalla.model.Pokemons.Lapras;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.Pokemons.Vaporeon;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("            POKEMON ROJO FUEGO!");
        System.out.println("-------------------------------------------\n");

        Arcanine arc = new Arcanine("ARCANINE      ");
        Charizard chari = new Charizard("CHARIZARD     ");
        Dragonite drag = new Dragonite("DRAGONITE     ");
        Lapras lap = new Lapras("LAPRAS        ");
        Pikachu pika = new Pikachu("PIKACHU       ");
        Vaporeon vapo = new Vaporeon("VAPOREON      ");
        
        Entrenador ent1 = new Entrenador("MAY");
        ent1.capturarPokemon(drag);
        ent1.capturarPokemon(vapo);
        ent1.capturarPokemon(arc);
        
        Entrenador ent2 = new Entrenador("RED");
        ent2.capturarPokemon(lap);
        ent2.capturarPokemon(chari);
        ent2.capturarPokemon(pika);
        
        Batalla b = null;
        
        Batalla batallaGuardada = FileManager.leerDesdeArchivo();
        
        if(batallaGuardada != null){
            
            b = batallaGuardada;

        } else {
                    System.out.println("              COMO SE JUEGA\n");
        
        System.out.println(" Para poder seleccionar un pokemon usa las\n"
                + "   teclas del 1 al 3 y para seleccionar\n    una accion o un movimiento usa las\n"
                + "            las teclas 1 al 4.\n");
        System.out.println("-------------------------------------------\n");
            b = new Batalla(ent1, ent2);
                   
        }
        
        b.desarrollarBatalla();
    }
}
    

