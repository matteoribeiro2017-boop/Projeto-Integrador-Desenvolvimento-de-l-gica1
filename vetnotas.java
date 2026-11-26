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
public class vetnotas {
    public static void main(String[] args) {
       double notas[] = new double[7];
        Scanner leia = new Scanner(System.in);
        
        for (int i = 1; i < notas.length; i++) {
            System.out.println("Digite a nota (" + i + ")");
            notas[i]= leia.nextDouble();
        }
        System.out.println("");
        System.out.println("Finalizou a entrada das notas");
        System.out.println("");
    
        
        for (int i = 1; i < notas.length; i++) {
            System.out.println(i+"-" + notas[i]);
        }
        
    }
}