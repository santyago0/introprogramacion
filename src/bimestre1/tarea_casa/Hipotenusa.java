package bimestre1.tarea_casa;

import java.util.Scanner;

/**
 * Programa para calcular el valor de la hipotenusa
 */
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULAR LA HIPOTENUSA\n");
        System.out.println("Ingrese el valor del cateto mayor: ");
        double cateto_a = teclado.nextDouble();
        System.out.println("Ingrese el valor del cateto menor: ");
        double cateto_b = teclado.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto_a, 2) + Math.pow(cateto_b, 2));
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
