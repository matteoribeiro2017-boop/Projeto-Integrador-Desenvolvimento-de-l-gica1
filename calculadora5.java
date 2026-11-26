/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv23;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class calculadora5 {

    public static void calculadora(int num, int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = leia.nextInt();
        System.out.println("Digite o numero do inicio: ");
        int inicio = leia.nextInt();
        System.out.println("Digite o numero do fim: ");
        int fim = leia.nextInt();

        while (num < 0 || fim < 0 || inicio > fim) {
            System.out.println("Limites ivalidos, Digite novamente");
            System.out.println("Digite o numero inteiro: ");
            num = leia.nextInt();
            System.out.println("Digite o numero do inicio: ");
            inicio = leia.nextInt();
            System.out.println("Digite o numero do fim: ");
            fim = leia.nextInt();
        }
        calculadora(num, inicio, fim);

    }
}
