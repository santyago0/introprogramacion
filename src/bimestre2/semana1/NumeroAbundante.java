package bimestre2.semana1;

import java.util.Scanner;

/**
 * Codificar algoritmo para determinar si un número es abundante o no
 */
public class NumeroAbundante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("DETERMINAR SI UN NÚMERO ES ABUNDANTE O NO");
        System.out.println("Ingrese un número: ");
        int n = teclado.nextInt();
        int suma_divisor = 0;
        for (int contador = 1; contador < n; contador++) {
            if (n%contador == 0) {
                suma_divisor = suma_divisor + contador;
            }
        }
        if (suma_divisor > n) {
            System.out.println(n +" si es abundante");
        }else {
            System.out.println(n +" no es abundante");
        }
    }
}
