package tarea_casa;

import java.util.Scanner;

/**
 * Programa para resolver una ecuación cuadrática con la fórmula general
 */
public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("RESOLVER UNA ECUACIÓN CUADRÁTICA\n");
        System.out.println("Una ecuación cuadrática tiene la siguiente estructura -> ax^2+bx+c=0");
        System.out.println("Ingrese el valor de 'a': ");
        double numero_a = teclado.nextDouble();
        System.out.println("Ingrese el valor de 'b': ");
        double numero_b = teclado.nextDouble();
        System.out.println("Ingrese el valor de 'c': ");
        double numero_c = teclado.nextDouble();
        double x_1 = (-numero_b + Math.sqrt(Math.pow(numero_b, 2) - 4 * numero_a * numero_c))/2;
        System.out.println("El valor de x1 = " + x_1);
        double x_2 = (-numero_b - Math.sqrt(Math.pow(numero_b, 2) - 4 * numero_a * numero_c))/2;
        System.out.println("El valor de x2 = " + x_2);
    }
}
