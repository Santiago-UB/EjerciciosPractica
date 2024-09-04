/*
Pedir por teclado dos números y mostrarlos ordenados de mayor a menor.
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class OrdenardeMayoraMenor {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int a;
        int b;
        System.out.print("ingrese el primer numero : ");
        a=teclado.nextInt();
        System.out.print("ingrese el sugundo numero : ");
        b=teclado.nextInt();
        if(a>b){
            System.out.print("el orden correcto es : "+a+"->"+b);
        }
        else
            System.out.print("el orden de mayor a menor es : "+b+" -> "+a);
    }
}
