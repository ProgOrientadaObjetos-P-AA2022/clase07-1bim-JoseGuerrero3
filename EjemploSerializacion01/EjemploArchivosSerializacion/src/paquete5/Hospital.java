/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
        
        
        
        
        
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void establecerPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}