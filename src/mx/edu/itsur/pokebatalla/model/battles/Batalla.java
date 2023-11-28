package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
import mx.edu.itsur.pokebatalla.FileManager;
import java.io.Serializable;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Batalla implements Serializable{
    
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

        System.out.println("              NUEVA BATALLA!!\n");
        System.out.println("       " + entrenador2.nombre + " TE DESAFIA A UNA BATALLA!\n");
        System.out.println("                " + entrenador1.nombre + " V.S " + entrenador2.nombre);
        System.out.println("\n-------------------------------------------\n");
        
        do {
            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("SOLO CUENTAS CON " + entrenador1.getPokemonsCapturados().size()
                        + " ELIGE ALGUNO DE ELLOS!!! \n");
                System.out.println("-------------------------------------------\n");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("SOLO CUENTAS CON " + entrenador2.getPokemonsCapturados().size()
                        + " ELIGE ALGUNO DE ELLOS!!! \n");
                System.out.println("-------------------------------------------\n");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            char auxLectura = '0';
            
            if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
                turno = 2;
            } else if(turno == 2){
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
                turno =1 ;
            }
            
            do{
                System.out.println("\n-------------------------------------------\n");
                System.out.println("               TURNO DE: " + entrenadorEnTurno.nombre + "\n");
                System.out.println(entrenadorOponente.getNombre());
                System.out.println(entrenadorOponente.getPokemonActual() + "\n");
                System.out.println(entrenadorEnTurno.getNombre());
                System.out.println(entrenadorEnTurno.getPokemonActual() + "\n");
                System.out.println("\n       QUE DEBERIA HACER TU POKEMON? \n");
                System.out.println("          1 LUCHA      2 POKEMON \n          3 MOCHILA    4 HUIDA \n");
                
                try {
                    auxLectura = (char) System.in.read();
                    System.in.read(new byte[System.in.available()]);
                    
                    if (auxLectura != '1' && auxLectura != '2'){
                        System.out.println("          ELIGE UNA OPCION VALIDA");
                    }
                    
                    if (auxLectura == '3' && auxLectura == '4'){
                        System.out.println("          ELIGE UNA OPCION VALIDA11");
                        auxLectura = 0;
                    }
                    
                    if (auxLectura == '2'){  
                        do {
                            try {
                                System.out.println("-------------------------------------------\n");
                                seleccionarPokemon(entrenadorEnTurno);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("SOLO CUENTAS CON " + entrenador1.getPokemonsCapturados().size()
                                + " ELIGE ALGUNO DE ELLOS!!! \n");
                            System.out.println("-------------------------------------------\n");
                            entrenadorEnTurno.setPokemonActual(null);
                        }
                        } while (entrenadorEnTurno.getPokemonActual() == null);
                    }
                    char auLectura = '0';
                    if (auxLectura == '1'){
                        do{
                            
                            System.out.println("\n-------------------------------------------\n");
                            System.out.println("               TURNO DE: " + entrenadorEnTurno.nombre + "\n");
                            System.out.println(entrenadorOponente.getNombre());
                            System.out.println(entrenadorOponente.getPokemonActual() + "\n");
                            System.out.println(entrenadorEnTurno.getNombre());
                            System.out.println(entrenadorEnTurno.getPokemonActual() + "\n");
                            System.out.println("\n      QUE MOVIMIENTO DESEA UTILIZAR?\n");
                            for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimiento()) {
                                System.out.println(movimiento.ordinal() + 1 + " " + movimiento.name());
                            }
                            System.out.println("");
                            try {
                                auLectura = (char) System.in.read();
                                System.in.read(new byte[System.in.available()]);
                                if (auLectura < '1' || auLectura > '4') {
                                    throw new IndexOutOfBoundsException("\n        "
                                            + "ELIGE UNA TECLA DEL 1 AL 4.");
                                }
                                entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.
                                        getPokemonActual(), Character.getNumericValue(auLectura) - 1);

                            } catch (IndexOutOfBoundsException ex) {
                                System.out.println(ex.getMessage());
                                auLectura = '0';
                            }
                        }while(auLectura < '1' || auLectura > '4');
                    }  
                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            } while (auxLectura != '1' && auxLectura != '2');

            if (entrenadorOponente.getPokemonActual().getHp() <= 0) {
            System.out.println("");
            System.out.println("-------------------------------------------");    
            System.out.println("El Pokemon de " + entrenadorOponente.getNombre() + " ha sido derrotado!");
            System.out.println("Felicidades " + entrenadorEnTurno.getNombre() + ", has ganado la batalla!");
            System.out.println("-------------------------------------------");
            int experienciaGanada = 50;
            entrenadorEnTurno.pokemonActual.ganarExperiencia(experienciaGanada);
            System.out.println(entrenadorEnTurno.pokemonActual + " ha ganado la batalla y ha ganado "
            + experienciaGanada + " puntos de experiencia");
            batallaFinalizada = true;

            
            }
        FileManager.guardarHaciaArchivo(this);
        }
    }
    
    private void seleccionarPokemon(Entrenador ent) {
        char auxLectura = '0';
        
        System.out.println("CUAL DE LOS POKEMONS DEBERIA UTILIZAR " + ent.nombre + "?\n");

        int auxCount = 1;
        for (Pokemon p : ent.getPokemonsCapturados()) {
            System.out.println(p + "\n");
            auxCount++;
        }
        try {
            auxLectura = (char) System.in.read();
            System.in.read(new byte[System.in.available()]);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);

        ent.setPokemonActual(pokemonSeleccionado);
        System.out.println("YO TE ELIJO! " + ent.pokemonActual.getNombre());
        System.out.println(ent.nombre + " ENVIO AL COMBATE A " + ent.pokemonActual.getNombre());
        System.out.println("\n-------------------------------------------\n");
    }

}