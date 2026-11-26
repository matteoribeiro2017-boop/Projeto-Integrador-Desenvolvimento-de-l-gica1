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
public class primo {

    public static boolean primo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro entre (-10000 e 10000)");
        int num = leia.nextInt();
        
        while ( num < -10000 || num > 10000){
        System.out.println("INVALIDO,Digite um numero inteiro entre (-10000 e 10000)");
        num = leia.nextInt();
        
        }
        if (primo(num)){
            System.out.println("é primo");
        }else {
            System.out.println("Nao e primo");
        }
    
    
    
    }
}
