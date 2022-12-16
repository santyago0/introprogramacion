package bimestre2.semana1.semana2;

import java.util.Scanner;

/**
 * Realizar un programa en java que permita convertir un número del sistema binario
 * de hasta 6 cifras a un número decimal.
 * - Se debe declarar un arreglo de 6 elementos fijos.
 * - Al ejecutar el programa se debe preguntar cuántos elementos contiene el número
 *   binario que se desea convertir, mismo que deberá ser menor o igual que 5.
 * - Luego se debería almacenar el número binario ingresado en un arreglo de tipo entero.
 * - Una vez ingresado el número realizar el proceso de conversión de binario a decimal.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("TRANSFORMAR DE BINARIO A DECIMAL");
        int binario[] = new int[6];
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos elementos contiene el número binario?");
        int element = teclado.nextInt();
        if (element <= 6) {
            binario = new int[element];
            for (int i = 0; i < binario.length; i++) {
                System.out.println("Ingrese el "+ (i+1) +"º elemento del número binario");
                int n = teclado.nextInt();
                binario[i] = n;
            }
            System.out.println("El número binario es: ");
            for (int i = 0; i < binario.length; i++) {
                System.out.print(binario[i] +"\t");
            }
            System.out.println("");
            System.out.println("TRANSFORMACIÓN: ");

        }else {
            System.out.println("El número binario no es posible");
        }
    }
}
