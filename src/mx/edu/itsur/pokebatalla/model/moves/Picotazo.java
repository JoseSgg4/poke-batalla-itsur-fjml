/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author jose
 */
public class Picotazo extends MovimientoFisico{
    public Picotazo() {
        this.tipo=TiposDeMovimiento.VOLADOR;
        this.potencia = 35;
        this.precision = 100;
        this.puntosPoder = 35;
    }
}
