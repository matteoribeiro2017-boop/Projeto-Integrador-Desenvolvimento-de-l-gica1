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
public class media {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[8];
        double soma = 0;
        double media;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = leia.nextInt();
            soma = soma + numeros[i];
        }
        media = soma/8;
        System.out.println("A media foi de: " + media);
    }
}
