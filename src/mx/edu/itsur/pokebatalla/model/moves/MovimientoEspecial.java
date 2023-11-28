package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class MovimientoEspecial extends Movimiento{
    
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacanteEsp = usuario.getAtaqueEsp();
        int poderMovimiento = this.potencia;
        int defensaEspObjetivo = objetivo.getDefensaEsp();
        int puntodepoder = this.puntosPoder;
        
        if (puntodepoder <= 0) {
            System.out.println(usuario + "esta agotado y no puede realizar mas el movimiento.");
            return;
        }else if (puntodepoder >=1){
            puntodepoder = this.puntosPoder - 1;
        }
        
        double modificador = 1.0;
        
        int danio = (int) (((((2 * nivelAtacante / 5 + 2)  * ataqueAtacanteEsp  * poderMovimiento / 
                defensaEspObjetivo)  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        
        System.out.println(usuario.getClass().getSimpleName() + " aplica movimiento especial " + this.getClass().getSimpleName() 
                + " a " + objetivo.getClass().getSimpleName() + " y causa danio de " + danio);
        
    }
}
