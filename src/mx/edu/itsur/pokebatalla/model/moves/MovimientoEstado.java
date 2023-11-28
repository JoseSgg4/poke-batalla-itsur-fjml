package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class MovimientoEstado extends Movimiento{
    
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.potencia;
        int defensaObjetivo = objetivo.getDefensa();
        int puntodepoder = this.puntosPoder;
        
        if (puntodepoder <= 0) {
            System.out.println(usuario + "esta agotado y no puede realizar mas el movimiento.");
            return;
        }else if (puntodepoder >=1){
            puntodepoder = this.puntosPoder - 1;
        }
        
        double modificador = 0;
        
        int danio = (int) (modificador);
        
        objetivo.recibirDanio(danio); 

        System.out.println(usuario.getClass().getSimpleName() + " USA MOVIMIENTO ESTADO " + this.getClass().getSimpleName() 
                + "\n A " + objetivo.getClass().getSimpleName() + " Y CAUSA DANIO DE " + danio);
        
    }
}
