/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adofunçoes;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class pareimpar {

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero (0 para sair): ");
        int numero = leia.nextInt();
        
        while(numero!=0){
        
            if(par(numero)){
                System.out.println("É par");
            }else{
                System.out.println("Impar ");
            }
         System.out.print("Digite um numero (0 para sair): ");
         numero = leia.nextInt();
        }

    }
}
