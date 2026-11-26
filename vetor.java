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
public class vetor {
    public static void main(String[] args) {
        int meuVetor[] = new int[11];
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 1; i < meuVetor.length; i++) {
            System.out.println("Digite o numero da posiçao (" + i + ")");
            meuVetor[i]=leitor.nextInt();
        }
        System.out.println("");
        System.out.println("Finalizou a entrada de dados");
        System.out.println(meuVetor);
        
        for (int i = 1; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i]+",");
        }
        
    }
}

