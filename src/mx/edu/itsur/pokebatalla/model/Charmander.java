/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Charmander extends Pokemon {
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("INFERNO");
        this.habilidades.add("ENVITEIGNEO");
    }

    public Charmander (String nombre){
        this(); 
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("INFERNO")){
         
            System.out.println("Realizando INFERNO");
        }else if(habilidad.equals("ENVITEIGNEO")){

            System.out.println("Realizando ENVITEIGNEO");            
        }
    
    }

}
