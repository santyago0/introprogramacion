package ejercicio_final;

import java.util.Scanner;

/**
 * Realizar un programa que genere y grafique con asteriscos la
 * serie fibonacci. Se debe recibir un número por teclado que indicará
 * el total de números generados para la serie.
 * Ejemplo: 6 -> (se generarán los 6 primeros números de la serie)
 * · Serie generada: 1 1 2 3 5 8
 * · Gráfico: *
 *            *
 *            **
 *            ***
 *            *****
 *            ********
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("SERIE DE FIBONACCI: NÚMEROS Y GRÁFICO");
        System.out.println("Ingrese un número: ");
        int n = teclado.nextInt();
        System.out.println("Se generará la serie fibonacci hasta el "+ n +"º número: ");
        int fibonacci = 1;
        int x = 1;
        int suma = 0;
        for(int contador = 1; contador <= n; contador++){
            System.out.print(x +" ");
            suma = x + fibonacci;
            x = fibonacci;
            fibonacci = suma;
        }
        System.out.println("");
        System.out.println("Gráfico: ");
        fibonacci = 1;
        x = 1;
        suma = 0;
        String dibujo = "";
        for(int contador = 1; contador <= n; contador++) {
            for (int fila = 1; fila <= n; fila++) {
                dibujo = "";
                for (int columna = 1; columna <= x; columna++) {
                    dibujo = dibujo + "*";
                }
            }
            System.out.println(dibujo);
            suma = x + fibonacci;
            x = fibonacci;
            fibonacci = suma;
        }
    }
}
