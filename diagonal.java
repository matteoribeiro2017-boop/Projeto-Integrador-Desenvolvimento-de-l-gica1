/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class diagonal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um numero:");
                matriz[i][j] = leia.nextInt();

            }
        }
        System.out.println("As diagonais foram:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " , ");
            soma = soma + matriz[i][i];

        }
        System.out.println("");
        System.out.println("As somas das diagonais foi de: " + soma);
    }

}
