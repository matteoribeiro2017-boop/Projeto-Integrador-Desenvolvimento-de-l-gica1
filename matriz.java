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
public class matriz {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = leia.nextInt();
            }
        }
        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }

            }
            System.out.println("");
            if (i < 2) {
                System.out.println("----------");
            }
        }

    }
}
