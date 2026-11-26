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
public class somaLinha {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            int somalinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um numero:");
                matriz[i][j] = leia.nextInt();

                somalinha = somalinha + matriz[i][j];

            }
            System.out.println("Soma da linha [" + (i + 1) + "]:" + somalinha);
        }

    }
}
