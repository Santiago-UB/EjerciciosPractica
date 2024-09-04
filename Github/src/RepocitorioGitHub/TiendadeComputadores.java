/*
En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class TiendadeComputadores {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de computadoras a comprar: ");
        int cantidadComputadoras = scanner.nextInt();

        double precioUnitario = 500.0;
        double precioTotal = cantidadComputadoras * precioUnitario;
        double descuento = 0.0;

        
        if (cantidadComputadoras < 5) {
            descuento = 0.10; 
        } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
            descuento = 0.20; 
        } else { 
            descuento = 0.40; 
        }

        double precioFinal = precioTotal - (precioTotal * descuento);

       
        String mensajeDescuento = null;
        switch ((int) (descuento * 100)) {
            case 10:
                mensajeDescuento = "10%";
                break;
            case 20:
                mensajeDescuento = "20%";
                break;
            case 40:
                mensajeDescuento = "40%";
                break;
        }

        System.out.println("Precio total sin descuento COP" + precioTotal);
        System.out.println("Descuento aplicado COP " + mensajeDescuento);
        System.out.println("Precio final con descuento COP" + precioFinal);

        scanner.close();
    }
}
