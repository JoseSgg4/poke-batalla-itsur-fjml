package mx.edu.itsur.pokebatalla.model.battles;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

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
    
    public void desarrollarBatalla() {
        Entrenador entrenadorEnTurno = null;
        Entrenador entrenadorOponente = null;

        System.out.println("");
        System.out.println("Un entrenador te ha desafiado a una batalla!");
        System.out.println("Entrenador " + entrenador2.nombre + " te desafia!");
        System.out.println("");
        System.out.println(entrenador1.nombre + " V.S " + entrenador2.nombre);
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        do {
            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con "
                        + entrenador1.getPokemonsCapturados().size()
                        + " Elige alguno de ellos!!! ");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con "
                        + entrenador2.getPokemonsCapturados().size()
                        + " Elige alguno de ellos!!! ");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);


        while (!batallaFinalizada) {          
            char auxLectura = '0';
            do{
                if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
                turno = 2;
            } else if(turno == 2){
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
                turno =1 ;
            }
            System.out.println("");
            System.out.println("-----------------------------------------");
            System.out.println("Es el turno de: " + entrenadorEnTurno.nombre);
            System.out.println("");
                System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
                System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
                System.out.println("");
                System.out.println("1 -> Deseas atacar?");
                System.out.println("2 -> Deseas cambiar de Pokemon?");
                try {
                    auxLectura = (char) System.in.read(); //Leer opción seleccionada
                    System.in.read(new byte[System.in.available()]); //Limpiar bufer
                    
                    if (auxLectura != '1' && auxLectura != '2'){
                        System.out.println("Elige una opcion valida.");
                        System.out.println("");
                    }
                    
                    if (auxLectura == '2'){  
                        do {
                            try {
                                System.out.println("");
                                System.out.println("-------------------------------------------");
                                System.out.println("");
                                seleccionarPokemon(entrenadorEnTurno);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Solamente cuentas con "
                                    + entrenadorEnTurno.getPokemonsCapturados().size()
                                    + " Elige alguno de ellos!!! ");
                            entrenadorEnTurno.setPokemonActual(null);
                        }
                    } while (entrenadorEnTurno.getPokemonActual() == null);
                    }
                    
                } catch(Exception ex) {
                    ex.printStackTrace();
                }     
            } while (auxLectura != '1' && auxLectura != '2');

            do{
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("Cual de los siguientes movimientos desea utilizar?");
                for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimiento()) {
                System.out.println(movimiento.ordinal() + 1 + " -> "
                        + movimiento.name());
            }
            
            try {
                auxLectura = (char) System.in.read(); //Leer opción seleccionada
                System.in.read(new byte[System.in.available()]); //Limpiar bufer
                
                if (auxLectura < '1' || auxLectura > '3'){
                System.out.println("Por favor, elige una opcion valida.");
                }
            }catch (Exception ex) {
                    ex.printStackTrace();
                    }
            }while (auxLectura < '1' || auxLectura > '3');
            

            try {
                entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.getPokemonActual(),
                Character.getNumericValue(auxLectura) - 1);
                
            if (entrenadorOponente.getPokemonActual().getHp() <= 0) {
            System.out.println("");
            System.out.println("--------------------------------------------------");    
            System.out.println("El Pokemon de " + entrenadorOponente.getNombre() + " ha sido derrotado!");
            System.out.println("Felicidades " + entrenadorEnTurno.getNombre() + ", has ganado la batalla!");
            System.out.println("--------------------------------------------------");
            batallaFinalizada = true;
            break;
            }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    private void seleccionarPokemon(Entrenador ent) {
        char auxLectura = '0';   
        System.out.println("Cual de los Pokemon desea utilizar " + ent.nombre + "?");
        System.out.println("");
        int auxCount = 1;
        for (Pokemon p : ent.getPokemonsCapturados()) {
            System.out.println(auxCount + " -> " + p);
            auxCount++;
        }
        try {
            auxLectura = (char) System.in.read(); //Leer opción seleccionada
            System.in.read(new byte[System.in.available()]); //Limpiar bufer

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);

        ent.setPokemonActual(pokemonSeleccionado);
        System.out.println(ent.getPokemonActual()+ ", yo te elijo!");
        System.out.println(ent.nombre + " envio a " + ent.getPokemonActual());
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
    }

}
