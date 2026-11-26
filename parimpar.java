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
public class parimpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[15];
        double soma = 0;
        double soma1=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = leia.nextInt();
             if ( numeros[i] % 2 ==0){
            soma = soma + 1;
             } else {
             soma1 = soma1 + 1;
             }
        }
        System.out.println("A quantidade de pares foi de: " + soma);
        System.out.println("A quantidade de impares foi de: " + soma1);
    }
}
    
