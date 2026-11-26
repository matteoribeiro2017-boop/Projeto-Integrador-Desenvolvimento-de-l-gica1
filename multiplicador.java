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
public class multiplicador {
    public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);
      int numeros1[] = new int [10];
      int numeros2[] = new int [10];
      int multiplicador;
      
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Digite um numero: ");
            numeros1[i] = leia.nextInt();
        }
        System.out.println("Digite o mutiplicador:");
        multiplicador = leia.nextInt();
        
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i]= numeros1[i]*multiplicador;
        }
        System.out.println("Resultados:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print( numeros2[i]+ " , ");
        }
    }
}
