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
public class Vetnomes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nomes[] = new String[9];
        Scanner leia = new Scanner(System.in);

        for (int i = 1; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa (" + i + ")");
            nomes[i] = leia.nextLine();
        }
        System.out.println("");
        System.out.println("Finalizou a entrada de nomes ");
        System.out.println("");

        for (int i = 1; i < nomes.length; i++) {
            System.out.println(i + "-" + nomes[i]);
        }

    }
}
