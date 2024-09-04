/*
Crear un programa que genera tres números enteros aleatorios (a, b, c) comprendidos entre 65 y 90,
ambos inclusive. Los mostraremos en pantalla
 */
package RepocitorioGitHub;

import java.util.Random;

/**
 *
 * @author santi
 */
public class NumerosRandom {
         public static void main(String arg[]) {
            int a, b, c;
            Random rnd = new Random();
            a = (rnd.nextInt(26) + 65);
            b = (rnd.nextInt(26) + 65);
            c = (rnd.nextInt(26) + 65);
            System.out.println(a);        
            System.out.println(b);        
            System.out.println(c);       
    }
    
}
