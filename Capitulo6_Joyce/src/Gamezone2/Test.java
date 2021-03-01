/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone2;

import java.util.Scanner;

/**
 *
 * @author Alexandra
 */
public class Test {
    public static void main(String[] args) {
        RandomGuess3 juego = new RandomGuess3();
        Scanner leer = new Scanner(System.in);
        int n = 0;
        
        do {
            System.out.println("Introduzca su juego");
            n = leer.nextInt();
            
            
        } while (!juego.tiro(n));
        
        System.out.println("Te tomó " + juego.getVeces());
        
        
        
        
    }
}
