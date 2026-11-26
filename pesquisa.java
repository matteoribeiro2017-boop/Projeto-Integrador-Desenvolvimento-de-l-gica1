/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class pesquisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];
        int encontrar;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = leia.nextInt();
        }
        System.out.println("Digite o numero que deseja pesquisar");
        encontrar = leia.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrar) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            System.out.println("O numero foi encontrado no vetor");

        } else {
            System.out.println("Numero nao encontrado");
        }
    }

}
