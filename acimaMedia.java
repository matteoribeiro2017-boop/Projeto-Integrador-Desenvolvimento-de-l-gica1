/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class acimaMedia {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[10];
        double soma = 0;
        double media;
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = leia.nextInt();
            soma = soma + numeros[i];
        }
        media = soma / 10;
        System.out.println("");
        System.out.println("A media foi de: " + media);
        System.out.println("Numeros acima dela: ");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.print(numeros[i] + ",");
                quantidade++;

            }
        }
        System.out.println("");
        System.out.println("Quantidade acima da media foi de: " + quantidade);
    }
}
