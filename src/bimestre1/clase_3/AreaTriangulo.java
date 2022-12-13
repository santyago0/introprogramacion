package bimestre1.clase_3;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULAR EL ÁREA DE UN TRIÁNGULO");
        System.out.println("Ingrese el valor de la base: ");
        double base = teclado.nextDouble(); //leemos un valor desde el teclado
        System.out.println("Ingrese el valor de la altura: ");
        double altura = teclado.nextDouble(); //leemos un valor desde el teclado
        double area = (base * altura)/2;
        double resultado = Math.round(area);
        System.out.println("El área del triángulo es: " + area);
    }
}
