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
public class inverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o numero(" + i + ")");
            num[i] = leia.nextInt();

        }
        System.out.println("");
        System.out.println("Fim da entrada de dados");

        for (int i = 9; i > -1; i--) {
            System.out.print(num[i] + ",");

        }
    }

}
