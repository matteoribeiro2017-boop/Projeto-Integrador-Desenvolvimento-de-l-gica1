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
public class comparaçao {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] numeros3 = new int[10];
        
         for (int i = 0; i < numeros1.length; i++) {
             System.out.println("Digite um numero:");
             numeros1[i] = leia.nextInt();
         }
         for (int i = 0; i < numeros2.length; i++) {
             System.out.println("Digite um numero :");
             numeros2[i] = leia.nextInt();
         }
         for (int i = 0; i < 10; i++) {
             numeros3[i]= numeros1[i]+ numeros2[i];
         }
        
         for (int i = 0; i < 10; i++) {
             System.out.println("Soma " + i +   " : "  + numeros3[i]);
         }
     }
}
