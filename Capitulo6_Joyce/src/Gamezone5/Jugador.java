/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone5;

/**
 *
 * @author Alexandra
 */
class Jugador {
     private int jugada;
    
    public Jugador(){
        this.jugada = 0;
    }
    
    public void setJugada(int num){
        this.jugada = num;
    }
    
    public int getJugada(){
        return this.jugada;
    }
    
}
