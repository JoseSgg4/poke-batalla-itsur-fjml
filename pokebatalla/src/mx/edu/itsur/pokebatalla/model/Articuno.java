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
public class Articuno extends Pokemon{

    public Articuno() {
        tipo = "HIELO/VOLADOR";
        hp = 90;
        ataque = 85;
        defensa = 75;
        nivel = 1;
        precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("RAYOHIELO");
        this.habilidades.add("FRIOPOLAR");
    }
    
        public Articuno (String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("RAYOHIELO")){
            
            System.out.println("Realizando RAYOHIELO");
        }else if(habilidad.equals("FRIOPOLAR")){
        
            System.out.println("Ataque Realizando FRIOPOLAR");            
        }
        
    }


}
