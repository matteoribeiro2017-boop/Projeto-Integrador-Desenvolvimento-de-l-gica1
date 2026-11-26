/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class fibonacci {

    public static long fibo(int n) {
        long a = 0;
        long b = 1;
        long resultado = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma posiçao entre (0 e 92)");
        int pos = leia.nextInt();
        
        while (pos<0|| pos>92){
            System.out.println("Posiçao invalida, Digite novamente: ");
            pos = leia.nextInt();
        }
        System.out.println("Fibonacci " + pos + "é = " + fibo(pos));
    }
}
