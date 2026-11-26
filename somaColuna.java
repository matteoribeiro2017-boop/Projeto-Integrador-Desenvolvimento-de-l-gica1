/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class somaColuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Digite um numero:");
                matriz[i][j] = leia.nextInt();
            }

        }

        for (int j = 0; j < 3; j++) {
            int somacoluna = 0;
            for (int i = 0; i < 4; i++) {
                somacoluna = somacoluna + matriz[i][j];

            }
            System.out.println("Soma da Coluna [" + (j + 1) + "]:" + somacoluna);
        }
    }

}
