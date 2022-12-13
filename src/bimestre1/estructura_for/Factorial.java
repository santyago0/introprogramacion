package bimestre1.estructura_for;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();
        int mult = 1;
        for (int contador = 1; contador <= numero; contador++){
            mult = mult * contador;
        }
        System.out.println("El factorial = "+ mult);
    }
}
