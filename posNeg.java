/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class posNeg {
    public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);
      int negativos[] = new int [15];
      int positivos[] = new int [15];
      int neg=0;
      int pos=0;
      
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um numero inteiro:");
            int numero = leia.nextInt();
            
            if ( numero > 0){
            positivos[pos]= numero;
            pos++;
            }else if ( numero <0){
            negativos[neg]= numero;
            neg++;
            }
        }
        
        System.out.print("Numeros positivos:");
        
        for (int i = 0; i < pos; i++) {
            System.out.print( positivos[i] + " , ");
        }
        System.out.println("");
        System.out.print("Numeros negativos: ");
         for (int i = 0; i < neg; i++) {
            System.out.print( negativos[i] + " , ");
        }
    }
}
