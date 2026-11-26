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
public class pareimpar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[3][4];
        int somapar = 0;
        int qtdpar = 0;
        int qtdimpar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite numero: ");
                matriz[i][j] = leia.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    somapar = somapar + matriz[i][j];
                    qtdpar++;
                } else {
                    qtdimpar++;

                }

            }
        }
        System.out.println("A quantidade de par foi de: " + qtdpar);
        System.out.println("A quantidade de impar foi de: " + qtdimpar);
        System.out.println("A soma dos´pares foi de: " + somapar);
    }

}
