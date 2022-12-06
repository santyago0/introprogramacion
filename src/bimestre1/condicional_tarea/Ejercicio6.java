package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar los días, horas y minutos correspondientes a los minutos ingresados.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR LOS DÍAS, HORAS Y MINUTOS, INGRESANDO LOS MINUTOS");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos: ");
        double min = teclado.nextDouble();
        double h = min/60;
        double d = min/1440;
        System.out.println(min+ " minutos equivalen a " +d+ " días " +h+ " horas " +min+ " minutos");
    }
}
