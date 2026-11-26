/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv23;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class mediafun {
    public static double calmedia(double not1,double not2){
        return (not1+not2)/2;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite nota 1: ");
        double not1 = leia.nextDouble();
       while(not1<0 || not1 > 10){
           System.out.println("Nota invalida,digite novamente: ");
           not1 = leia.nextDouble();
       }
        System.out.println("Digite nota 2: ");
        double not2 = leia.nextDouble();
         while(not2 < 0 || not2 > 10){
           System.out.println("Nota invalida,digite novamente: ");
           not2 = leia.nextDouble();
       }
        
        double media = calmedia(not1,not2);
        System.out.println("Media foi: " + media);
        if(media>=6){
            System.out.println("APROVADO");
        }else {
            System.out.println("EM RECUPERAÇAO");
        }
        
 }
}
