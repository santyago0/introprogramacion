package bimestre1;

import java.util.Scanner;

public class CondicionalAnidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORÍA DE EDAD");
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad > 0 && edad <= 150) {
            if (edad > 0 && edad < 18) {
                System.out.println("Eres menor de edad");
                System.out.println("Eres aún un niño");
            } else if (edad >= 18 && edad <= 65)
                System.out.println("Eres mayor de edad");
            else if (edad > 65 && edad <= 100)
                System.out.println("Eres de la tercera edad");
            else if (edad > 100 && edad <= 150)
                System.out.println("Eres una persona sabia");
        } else
            System.out.println("Edad inválida");
    }
}