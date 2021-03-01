/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone2;

import java.util.Random;

/**
 *
 * @author felipe
 */
public class RandomGuess3 {
    private int num;
    private int veces;
    
    public RandomGuess3(){
        Random rnd = new Random();
        this.num = rnd.nextInt(100)+1;
        this.veces = 0;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public Boolean tiro(int n){
        if (n==this.num) {
            System.out.println("Has acertado");
            return true;
        }else if (n<this.num) {
            System.out.println("Te falta");
            this.veces++;
            return false;
        }else{
            System.out.println("Te sobra");
            this.veces++;
            return false;
        }
    }
    
    public int getVeces(){
        return this.veces;
    } 
}
