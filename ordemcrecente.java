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
public class ordemcrecente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
     
     int numeros[] = new int [10];
     int ordem;
     
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[i]= leia.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i]> numeros[j]){
                ordem = numeros[i];
                numeros[i]= numeros[j];
                numeros[j]=ordem;      
                }
            }
        }
        System.out.print("Ordem Crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print( numeros[i] + " , ");
        }
    }
    
}
