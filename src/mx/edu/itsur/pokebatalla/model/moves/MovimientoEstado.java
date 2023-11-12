package mx.edu.itsur.pokebatalla.model.moves;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class MovimientoEstado extends Movimiento{
    
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        System.out.println("APLICANDO MOVIMIENTO ESTADO");
        
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.potencia;
        int defensaObjetivo = objetivo.getDefensa();
        
        double modificador = 1.0;
        
                int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
        System.out.println("El objetivo quedo asi: " + objetivo);  
    }
}
