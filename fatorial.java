/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes;
import java.util.Scanner;
/**
 *
 * @author matteo.rbatagliese
 */
public class fatorial {
public static long fatorial(int n){
  long resultado=1;
    for (int i = 1; i <=n; i++) {
      resultado= resultado*i;  
    }
    return resultado;
}
    public static void main(String[] args) {
   Scanner leia = new Scanner (System.in);
        System.out.println("Digite um numero inteiro (Entre 0 e 20)");
        int num = leia.nextInt();
         
        while (num <0 || num >20){
            System.out.println("Invalido,Digite um numero inteiro (Entre 0 e 20");
            num = leia.nextInt(); 
        }
     
             System.out.println("Fatorial de " + num + " e: " + fatorial(num));
   
    }
    
}
