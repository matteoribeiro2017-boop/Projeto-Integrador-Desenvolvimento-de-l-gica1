/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class soma {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        double soma=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = leia.nextInt();
                
                soma= soma + matriz[i][j];
            }
        }
        
        System.out.println("Soma dos vetores foi de:" + soma);
    } 
}
