package bimestre1.estructura_for;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();
        for (int contador = 1; contador <= numero; contador++){
            if (numero%contador == 0)
                System.out.println(contador);
        }
    }
}
