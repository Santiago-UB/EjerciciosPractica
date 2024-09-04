/*
Escribir un programa que pida cuantos hombres y mujeres hay en un aula (números enteros) y nos
informa del porcentaje de hombres y de mujeres.
 */
package RepocitorioGitHub;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PorcentajedeHyM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Mujeres,Hombres,Total;
        System.out.println("Ingresar número de Hombres: ");
        Hombres = input.nextInt();
        System.out.println("Ingresar número de Mujeres: ");
        Mujeres = input.nextInt();
        
        Total = Hombres + Mujeres;
        
        System.out.println("El porcentaje de Hombres es: " +(Hombres*100)/Total+"%");
        System.out.println("El porcentaje de Mujeres es: " +(Mujeres*100)/Total+"%");
        
    }
    
}
