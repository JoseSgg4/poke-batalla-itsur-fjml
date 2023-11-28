package mx.edu.itsur.pokebatalla.model.moves;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class MovimientoFisico extends Movimiento{
        
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.potencia;
        int defensaObjetivo = objetivo.getDefensa();
        int puntodepoder = this.puntosPoder;
        
        if (this.puntosPoder <= 0) {
            System.out.println(usuario + "esta agotado y no puede realizar mas el movimiento.");
            return;
        }else if (this.puntosPoder >=1){
            this.puntosPoder = this.puntosPoder - 1;
        }
        
        double modificador = 1.0;
        
        int danio = (int) (((((2 * nivelAtacante / 5 + 2)  * ataqueAtacante  * poderMovimiento / 
                defensaObjetivo)  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        System.out.println(usuario.getClass().getSimpleName() + " aplica movimiento fisico " + this.getClass().getSimpleName() 
                + " a " + objetivo.getClass().getSimpleName() + " y causa danio de " + danio);
        
    }
}
