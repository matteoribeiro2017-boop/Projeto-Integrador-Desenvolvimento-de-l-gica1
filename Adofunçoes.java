/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adofunçoes;

/**
 *
 * @author matteo.rbatagliese
 */
public class Adofunçoes {

    public static void banho(){
        System.out.println("Entrar no banheiro ");
        System.out.println("Tirar a roupa");
        System.out.println("Tomar banho");
        System.out.println("Se secar");
        System.out.println("Vestir roupa");
    }
    public static void escovarDentes(){
        System.out.println("Pegar a escova e a pasta de dentes");
        System.out.println("Escovar os dentes");
        System.out.println("Enxarguar a boca");
    }
    public static void comer(String comida,String bebida){
        System.out.println("Comer " + comida);
        System.out.println("Beber " + bebida);
    }
    public static void carro(String origem,String destino){
        System.out.println("Entrar no carro");
        System.out.println("Ligar o carro");
        System.out.println("Dirigir de " + origem + " ate " + destino);
        System.out.println("Chegar no " + destino);
    }
    public static void main(String[] args) {
        System.out.println("Acordar"); 
        System.out.println("Levantar da cama");
        //primeiro banho
        banho();
        escovarDentes();
        System.out.println("Sai de casa");
        carro("casa","Trabalho");
        System.out.println("Trabalhar");
        System.out.println("Ir comer ");
        comer("Arroz e bife","Suco de uva");
        escovarDentes();
        System.out.println("Voltar a trabalhar");
        System.out.println("Ir embora do trabalho");
        carro("Trabalho","Casa");
        System.out.println("Entrar em casa");
        banho();
        comer("Pizza","Coca");
        escovarDentes();
        System.out.println("Ir dormir");
        System.out.println("Deitar na cama");
        System.out.println("Dormir");
        
        
    }
    
}
