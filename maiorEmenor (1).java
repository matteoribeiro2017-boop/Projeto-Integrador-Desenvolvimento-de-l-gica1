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
public class maiorEmenor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int maior = 0;
        int linhamaior = 0;
        int colunamaior = 0;

        int menor = 0;
        int linhamenor = 0;
        int colunamenor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite numero: ");
                matriz[i][j] = leia.nextInt();

                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhamaior = i;
                    colunamaior = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhamenor = i;
                    colunamenor = j;

                }
            }
        }
        System.out.println("O maior numero foi: [" + maior + "]" );
        System.out.println("A posiçao da linha foi: [" + linhamaior + "]");
        System.out.println("A posiçao da coluna foi : [" + colunamaior + "]");
        System.out.println("");
        System.out.println("O menor numero foi: [" + menor + "]" );
        System.out.println("A posiçao da linha foi: [" + linhamenor + "]");
        System.out.println("A posiçao da coluna foi : [" + colunamenor + "]");
        
    }
}
