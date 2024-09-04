/*
Pedir el precio de un producto (al usuario, por teclado), y decir el precio con el IVA añadido (suponer
un IVA único del 21% )
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PedirIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final double IVA = 0.21;
        double precio;
        double precioFinal;
        System.out.println("Ingresa el precio del producto: ");
        precio = sc.nextDouble();
        
        precioFinal = precio + (precio*IVA);
        System.out.println("El precio final es: " + precioFinal);
    }
    
}
