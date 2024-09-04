/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area,radio;
        System.out.println("Ingresa el radio del circulo: ");
        radio = input.nextDouble();
        area = 3.14* (radio*radio);
        System.out.println("El area del circulo es: " + area);
    }
    
}
