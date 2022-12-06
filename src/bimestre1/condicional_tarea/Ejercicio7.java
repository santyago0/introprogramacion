package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar de entre dos números, si el primer número es mayor o es menor que el segundo.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR SI EL PRIMER NÚMERO INGRESADO ES MAYOR O MENOR QUE EL SEGUNDO");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segudo número: ");
        int num2 = teclado.nextInt();
        if (num1>num2){
            System.out.println("El primer número es mayor");
        }else{
            System.out.println("El primer número es menor");
        }
    }
}
