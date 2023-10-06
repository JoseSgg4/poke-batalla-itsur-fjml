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
public class Moltres extends Pokemon{
    
    public Moltres () {
        tipo = "FUEGO/VOLADOR";
        hp = 90;
        ataque = 100;
        defensa = 90;
        nivel = 1;
        precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ATAQUEALA");
        this.habilidades.add("ATAQUEAEREO");
    }
    
        public Moltres (String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATAQUEALA")){
            
            System.out.println("Realizando ATAQUEALA");
        }else if(habilidad.equals("ATAQUEAEREO")){
        
            System.out.println("Ataque Realizando ATAQUEAEREO");            
        }
        
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
