/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adofunçoes;
import java.util.Scanner;
/**
 *
 * @author matteo.rbatagliese
 */
public class saudaçao {
   public static void saudacao(String nome,String turno){
   if(turno.equalsIgnoreCase("Manha")){
       System.out.println("Bom dia, " + nome + "!");
   }else if (turno.equalsIgnoreCase("Tarde")){
       System.out.println("Boa Tarde, " + nome + "!");
   }else if(turno.equalsIgnoreCase("Noite")){
       System.out.println("Boa Noite, " + nome + "!");
   }else{
       System.out.println("Turno invalido");
   }
   }
 public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
   
     System.out.println("Digite seu nome");
     String nome = leia.nextLine();
     
     System.out.println("Digite seu turno");
     String turno = leia.nextLine();
     
     saudacao(nome,turno);
 
 }
   
}
