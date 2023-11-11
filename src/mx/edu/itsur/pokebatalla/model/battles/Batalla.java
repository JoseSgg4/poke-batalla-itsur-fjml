package mx.edu.itsur.pokebatalla.model.battles;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Batalla {
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }
    
    public void desarrollarBatalla(){
        //La primera vez ambos entrenadores se elegiran Pokemons.
	//Considerar turnar el entrenador acorde a variable turno.
	//Se debe dar opción al entrenador en turno de que cambie de Pokemon antes de escoger movimiento.
        //El entrenador en turno selecciona el ataque a utilizar de su pokemon actual.
        //Tras realizar el movimiento, revisar si el oponente está derrotado y terminó la batalla.
	//Si nadie ha ganado aún, se cambia el turno y repite.
    }
    
}
