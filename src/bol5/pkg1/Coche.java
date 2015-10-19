/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg1;

/**
 *
 * @author galle
 */
public class Coche {
    //Atributo
    private int velocidad;
    
    //Constructor
    public Coche (){
        velocidad = 0;
    }
    //Metodos
    public int getVelocidad(){
       return velocidad;
    }
    public void acelerar (int valor){
        velocidad = velocidad + valor;
    }
    public void frenar (int menos){
        velocidad = velocidad - menos;
    }
    
}