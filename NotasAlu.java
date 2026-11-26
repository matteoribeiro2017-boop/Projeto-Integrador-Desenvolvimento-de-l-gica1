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
public class NotasAlu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float matriz[][] = new float[5][3];
        float soma = 0;
        float media;
        float mediageral = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite a notas do aluno [" + (i + 1) + "]" + ":");
                matriz[i][j] = leia.nextFloat();

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
            media = soma / 3;
            mediageral = mediageral + media;

            if (media >= 6) {
                System.out.println("APROVADO");
            }else {
                System.out.println("REPROVADO");
            }

        }
        System.out.println("A media da turma foi de:" + (mediageral/5));
    }
}
