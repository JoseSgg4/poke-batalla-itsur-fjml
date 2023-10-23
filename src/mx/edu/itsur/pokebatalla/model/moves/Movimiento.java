package mx.edu.itsur.pokebatalla.model.moves;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Movimiento {

    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR      
    }

    
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.potencia; 
        int defensaObjetivo = objetivo.getDefensa();
        
        
        double modificador = 1.0;        
        
        
        int danio = (int) (((((2 * nivelAtacante / 5 + 2) * ataqueAtacante * poderMovimiento / defensaObjetivo) / 50) + 2) * modificador);
        objetivo.recibirDanio(danio); 
        

        System.out.println(
                         usuario.getClass().getSimpleName() + " uso " + 
                         this.getClass().getSimpleName() + "! a " +  
                         objetivo.getClass().getSimpleName() + " y le causa danio de " +
                         danio);
        System.out.println("El pokemon quedo asi: " + objetivo);
        
    }    
}
