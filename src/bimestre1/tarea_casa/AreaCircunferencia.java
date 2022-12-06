package tarea_casa;

import java.util.Scanner;

/**
 *Programa para obtener el área de una circunferencia
 */
public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("OBTENER EL ÁREA DE UNA CIRCUNFERENCIA\n");
        double pi = 3.14159;
        System.out.println("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = pi * Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es: " + area);
    }
}
