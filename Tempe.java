/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 * 
 */
public class Tempe {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float matriz[][] = new float[7][3];
        float media;
        float mediageral = 0;
        float maior;
        float menor;
        float soma = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println("Dia " + (i + 1) + " digite a temperatura de Manha: ");
                    matriz[i][j] = leia.nextFloat();
                }
                if (j == 1) {
                    System.out.println("Dia " + (i + 1) + " digite a temperatura de Tarde: ");
                    matriz[i][j] = leia.nextFloat();
                }
                if (j == 2) {
                    System.out.println("Dia " + (i + 1) + " digite a temperatura de Noite: ");
                    matriz[i][j] = leia.nextFloat();
                }
            }
        }
        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            soma = 0;
            for (int j = 0; j < 3; j++) {
                soma = soma + matriz[i][j];
            }
            media = soma / 3;
            System.out.println("A media do dia " + (i + 1) + " foi: " + media);

            mediageral = mediageral + soma;
        }
        System.out.println("");
        System.out.println("A maior temperatura foi de: " + maior);
        System.out.println("A menor temperatura foi de: " + menor);
        System.out.println("A media geral foi de: " + (mediageral/21));

    }
}
