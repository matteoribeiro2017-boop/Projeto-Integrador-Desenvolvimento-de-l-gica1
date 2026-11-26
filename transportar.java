/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @matteo.rbatagliese
 */
public class transportar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite  um numero:");
                matriz[i][j] = leia.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        
        System.out.println("Matriz Transportada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                  System.out.print( matriz [j][i] + " " );  
                
            }
            System.out.println("");
        }

    }

}
