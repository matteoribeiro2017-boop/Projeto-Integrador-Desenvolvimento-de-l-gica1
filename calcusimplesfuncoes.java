/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoesapl1;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class calcusimplesfuncoes {
    
    public static int menu() {
        Scanner leia = new Scanner(System.in);
        int op;
        do{
        System.out.println("=========================");
        System.out.println("===CALCULADORA SIMPLES===");
        System.out.println("=========================");
        System.out.println("1-Adiçao");
        System.out.println("2-Subtraçao");
        System.out.println("3-Mutiplicaçao");
        System.out.println("4-Divisao");
        System.out.println("Digite a opçao: ");
        op = leia.nextInt();
        }while(op <1 || op >4);
        return op;
    }
    
    public static float entradaDados() {
        System.out.println("===ENTRADA DE DADOS===");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite numero:");
        float n = leia.nextFloat();
        return n;
    }
    
    public static float adicao(float n1, float n2) {
        System.out.println("===ADIÇAO===");
        float result = n1 + n2;
        return result;
    }
    
    public static float subtracao(float n1, float n2) {
        System.out.println("===SUBTRAÇAO===");
        return n1 - n2;
    }
    
    public static float mutiplicacao(float n1, float n2) {
        System.out.println("===MUTIPLICAÇAO===");
        return n1 * n2;
    }
    
    public static float divisao(float n1, float n2) {
        System.out.println("===DIVISAO===");
        return n1 / n2;
    }
    
    public static void imprimir(float result) {
        System.out.println("===IMPRIMIR===");
        System.out.println("Resultado: " + result);
    }
    
    public static float controlador(int op, float n1, float n2) {
        System.out.println("===CONTROLADOR===");
        float result = 0;
        
        if (op == 1) {
            result = adicao(n1, n2);
        } else if (op == 2) {
            result = subtracao(n1, n2);
            
        } else if (op == 3) {
            result = mutiplicacao(n1, n2);
            
        } else if (op == 4) {
            result = divisao(n1, n2);
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("===MAIN===");        
        int op = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float result = controlador(op, n1, n2);        
        imprimir(result);
    }
}
