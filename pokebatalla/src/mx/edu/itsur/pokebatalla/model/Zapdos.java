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
public class Zapdos extends Pokemon{
    
    public Zapdos() {
        tipo = "ELECTRICO/VOLADOR";
        hp = 90;
        ataque = 90;
        defensa = 75;
        nivel = 1;
        precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("TRUENO");
        this.habilidades.add("ELECTROCANON");
    }
    
        public Zapdos (String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("TRUENO")){
            
            System.out.println("Realizando TRUENO");
        }else if(habilidad.equals("ELECTROCANON")){
        
            System.out.println("Realizando ELECTROCANON");            
        }
        
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
