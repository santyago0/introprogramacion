package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Programa para verificar a través de métodos si un núemero es primo,
 * y si es para o impar
 */
public class Verificacion {
    public boolean verificar_primo(int num_a_verificar) {
        int divisores = 0;
        for (int contador = 1; contador <= num_a_verificar; contador++) {
            if (num_a_verificar%contador == 0) //destacamos un nuevo divisor
                divisores++;
        }
        if (divisores == 2) //verificamos si es primo
            return true;
        else
            return false;
    }
    public boolean verificar_par(int numero_a_verificar) {
        if (numero_a_verificar%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Verificacion mivariable = new Verificacion();
        System.out.println("Ingrese un número: ");
        int num = teclado.nextInt();
        if (mivariable.verificar_primo(num))
            System.out.println("Si es primo");
        else
            System.out.println("No es primo");
        if (mivariable.verificar_par(num))
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
