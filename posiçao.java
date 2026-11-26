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
public class posiçao {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
       int vetor[] = new int [10];
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero ("+ i + ")");
            vetor[i] = leia.nextInt();
            
        }
        System.out.println("Finalizou a entrada");
        System.out.println("");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O indice " + i + " eh: " + vetor[i]);
            
        }
  
    
    
    
    
    }
}
