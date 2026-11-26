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
public class menu {

    public static double calmedia(double not1, double not2) {
        return (not1 + not2) / 2;
    }

    public static void tabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

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

    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ops = -1;
        while (ops != 0) {
            System.out.println("--MENU--");
            System.out.println("1-calcular a media");
            System.out.println("2-Tabuada");
            System.out.println("3-Numero Primo");
            System.out.println("4-Fatorial");
            System.out.println("0-Para Encerrar");
            System.out.println("ESCOLHA UMA OPCAO: ");
            ops = leia.nextInt();

            switch (ops) {

                case 1:
                    System.out.println("Digite nota 1: ");
                    double not1 = leia.nextDouble();
                    while (not1 < 0 || not1 > 10) {
                        System.out.println("Nota invalida,digite novamente: ");
                        not1 = leia.nextDouble();
                    }
                    System.out.println("Digite nota 2: ");
                    double not2 = leia.nextDouble();
                    while (not2 < 0 || not2 > 10) {
                        System.out.println("Nota invalida,digite novamente: ");
                        not2 = leia.nextDouble();
                    }

                    double media = calmedia(not1, not2);
                    System.out.println("Media foi: " + media);
                    if (media >= 6) {
                        System.out.println("APROVADO");
                    } else {
                        System.out.println("EM RECUPERAÇAO");
                    }
                    
                    break;

                case 2:

                    System.out.println("Digite um numero para a tabuada: ");
                    int tabuada = leia.nextInt();

                    tabuada(tabuada);
                    break;

                case 3:

                    System.out.println("Digite um numero inteiro entre (-10000 e 10000)");
                    int num = leia.nextInt();

                    while (num < -10000 || num > 10000) {
                        System.out.println("INVALIDO,Digite um numero inteiro entre (-10000 e 10000)");
                        num = leia.nextInt();

                    }
                    if (primo(num)) {
                        System.out.println("é primo");
                    } else {
                        System.out.println("Nao e primo");
                    }
                    break;

                case 4:

                    System.out.println("Digite um numero inteiro (Entre 0 e 20)");
                    int numFat = leia.nextInt();

                    while (numFat < 0 || numFat > 20) {
                        System.out.println("Invalido,Digite um numero inteiro (Entre 0 e 20");
                        numFat = leia.nextInt();
                    }

                    System.out.println("Fatorial de " + numFat + " e: " + fatorial(numFat));

                    break;

                case 0:
                    System.out.println("ENCERRADO");

                    break;

                default:
                    System.out.println("Opçao invalida");

            }
        }
    }

}
