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
public class posiçaoValor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];
        int encontrar;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = leia.nextInt();
        }
        System.out.println("Digite o numero que deseja pesquisar");
        encontrar = leia.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrar) {
                System.out.println("Encontrado na posiçao: " + i);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Numero nao encontrado");
        }

    }
}
