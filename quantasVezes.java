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
public class quantasVezes {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[15];
        int encontrar;
        int quantidade=0;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = leia.nextInt();
        }
        System.out.println("Digite o numero que deseja pesquisar");
        encontrar = leia.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrar) {
                encontrado = true;
                quantidade++;
            }
        }
        if (encontrado == true) {
            System.out.println("O numero foi encontrado no vetor " + quantidade + " vezes");

        } else {
            System.out.println("Numero nao encontrado");
        }
    }
}
