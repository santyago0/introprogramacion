package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para calcular el valor de la presión en libras por pulgada cuadrada de una onda.
 * Para tiempo, t, igual a o menor que 35 segundos, la presión es 0.46t psi.
 * Y para tiempo mayor que 35 segundos la presión es 0.19t + 9.45psi.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL VALOR DE LA PRESIÓN EN LIBRAS POR PULGADA CUADRADA");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor para tiempo: ");
        double t = teclado.nextDouble();
        if (t<=35){
            double psi = 0.46*t;
            System.out.println("La presión es: " +psi+ " psi");
        }else{
            double psi = 0.19*t + 9.45;
            System.out.println("La presión es: " +psi+ " psi");
        }
    }
}
