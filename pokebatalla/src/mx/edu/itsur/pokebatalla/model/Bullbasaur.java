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
public class Bullbasaur extends Pokemon {

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("DOBLEFILO");
        this.habilidades.add("BOMBAGERMEN");
    }

    public Bullbasaur(String nombre){
        this(); 
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("DOBLEFILO")){
         
            System.out.println("Realizando DOBLEFILO");
        }else if(habilidad.equals("BOMBAGERMEN")){

            System.out.println("Realizando BOMBAGERMEN");            
        }
    
    }
}
