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
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander();
        Bullbasaur bullbasaurSalvaje = new Bullbasaur();
        Articuno articunoSalvaje = new Articuno();
        Moltres moltresSalvaje = new Moltres();
        Zapdos zapdosSalvaje = new Zapdos();
        
        //Realizar la captura del pikachu salvaje   
        pikachuSalvaje.setNombre("Pikachu");
        charmanderSalvaje.setNombre("Charmander");
        articunoSalvaje.setNombre("Articuno");
        zapdosSalvaje.setNombre("Zapdos");
        
        Pikachu miPikachu = pikachuSalvaje;
        Articuno miArticuno = articunoSalvaje;
        Moltres miMoltres = moltresSalvaje;
        
        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pikachuSalvaje.atacar(charmanderSalvaje, Pikachu.Movimientos.IMPACTRUENO);
        
        System.out.println("->Charmander se molesta y responde ");
        charmanderSalvaje.atacar(pikachuSalvaje, Charmander.Movimientos.ATAQUE_RAPIDO);
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullbasaurSalvaje.atacar(charmanderSalvaje, Bullbasaur.Movimientos.LATIGO);
        
        System.out.println("");
        System.out.println("Nueva Batalla Pokemon! --------------------------------");
        System.out.println("");
        
        
        System.out.println("Aperecio un Moltres salvaje!");
        System.out.println("Adelante, Articuno!");
        System.out.println("");
        articunoSalvaje.atacar(moltresSalvaje, Articuno.Movimientos.RAYO_HIELO);
        System.out.println("");
        moltresSalvaje.atacar(articunoSalvaje, Moltres.Movimientos.PICOTAZO);
        System.out.println("");
        articunoSalvaje.atacar(moltresSalvaje, Articuno.Movimientos.ATAQUE_AEREO);
        System.out.println("");
        moltresSalvaje.atacar(articunoSalvaje, Moltres.Movimientos.GIRO_FUEGO);
        System.out.println("");
        articunoSalvaje.atacar(moltresSalvaje, Articuno.Movimientos.SUSTITUTO);
        System.out.println("");
        System.out.println("Moltres se va del combate!");

        System.out.println("");
        System.out.println("Nueva Batalla Pokemon! --------------------------------");
        System.out.println("");
        
        
        System.out.println("Aperecio un Bullbasaur salvaje!");
        System.out.println("Adelante, Articuno!");
        System.out.println("");
        articunoSalvaje.atacar(bullbasaurSalvaje, Articuno.Movimientos.RAYO_HIELO);
        System.out.println("");
        bullbasaurSalvaje.atacar(articunoSalvaje, Bullbasaur.Movimientos.ATAQUE_RAPIDO);
        System.out.println("");
        articunoSalvaje.atacar(bullbasaurSalvaje, Articuno.Movimientos.ATAQUE_AEREO);
        System.out.println("");
        bullbasaurSalvaje.atacar(articunoSalvaje, Bullbasaur.Movimientos.ATAQUE_RAPIDO);
        System.out.println("");
        articunoSalvaje.atacar(bullbasaurSalvaje, Articuno.Movimientos.ATAQUE_AEREO);
        System.out.println("");
        System.out.println("Bullbasaur se va del combate!");
    }
}
