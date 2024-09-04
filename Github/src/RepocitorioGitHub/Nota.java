/*
Pedir por teclado una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Nota {
     public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        System.out.println(" ingrese la nota del alumno ");
        int nota=teclado.nextInt();
       
        if(nota>=7){
               System.out.println("bien");
           }else{
               if(nota>5&&nota<7){
                   System.out.println("suficiente");
               }else{
                   if(nota<=5){
                       System.out.println("insuficiente");
                   }
                   
               }
        }
     }
}
