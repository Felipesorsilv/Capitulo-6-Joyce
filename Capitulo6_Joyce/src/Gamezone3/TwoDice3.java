/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone3;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class TwoDice3 {
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Die dado1 = new Die();
        Die dado2 = new Die();
        
        System.out.println("Introduzca su número entre 2 y 12: ");
        int num = leer.nextInt();
        int cont = 0;
        leer.nextLine();
        
        
        
        for (int i = 0; i < 3; i++) {
            dado1.lanzar();
            dado2.lanzar();
            
            System.out.println("Tirada n "+(i+1));
            System.out.println("Dado 1: "+dado1.getNumero()+"\nDado 2: "+dado2.getNumero());
            System.out.println("");
            if((dado1.getNumero()+dado2.getNumero())==num){
                System.out.println("Has acertado");
                cont++;     
                break;
            }
        }
        
        if (cont==0) {
            System.out.println("La computadora ganó");
        }else{
            System.out.println("Has ganado:");
        }
        
        
        
    }
}
