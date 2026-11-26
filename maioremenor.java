/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes;

import java.util.Scanner;


public class maioremenor {

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int menor(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int max = 0;
        int min = 0;
        boolean inf = false;

        System.out.println("Digite numeros inteiros (digite 0 para parar):");
        num = entrada.nextInt();

        while (num != 0) {

            if (!inf) {
                max = num;
                min = num;
                inf = true;
            } else {
                max = maior(max, num);
                min = menor(min, num);
            }

            num = entrada.nextInt();
        }

        if (inf) {
            System.out.println("Maior: " + max);
            System.out.println("Menor: " + min);
        } else {
            System.out.println("Nenhum numero informado");
        }
    }

}
