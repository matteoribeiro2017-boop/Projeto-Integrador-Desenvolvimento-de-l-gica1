/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class par {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = leia.nextInt();
        int i = 1;
        while (i<=10){
        int resultado = num*i;
            System.out.println(num + "x" + i + " = " + resultado);
        i++;
        }
        
    }
}
