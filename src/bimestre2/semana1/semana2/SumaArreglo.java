package bimestre2.semana1.semana2;

import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA OBTENER LA SUMA DE LOS ELEMENTOS DE DOS ARREGLOS");
        System.out.println("¿De qué tamaño van a ser los arreglos?");
        int tam_arreglos = teclado.nextInt();
        int numeros1[] = new int[tam_arreglos];
        System.out.println("Ingrese los  números del primer arreglo");
        for (int indice = 0; indice < numeros1.length; indice++) {
            int numeros = teclado.nextInt();
            numeros1[indice] = numeros;
        }
        for (int i = 0; i < numeros1.length; i++) {
            System.out.print(numeros1[i] +"\t");
        }
        System.out.println("");
        int numeros2[] = new int[tam_arreglos];
        System.out.println("Ingrese los  números del segundo arreglo");
        for (int indice = 0; indice < numeros2.length; indice++) {
            int numeros = teclado.nextInt();
            numeros2[indice] = numeros;
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] +"\t");
        }
        System.out.println("");
        int suma_arreglos[] = new int[tam_arreglos];
        for (int indice = 0; indice < suma_arreglos.length; indice++) {
            suma_arreglos[indice] = numeros1[indice] + numeros2[indice];
        }
        System.out.println("La suma de los arreglos es: ");
        for (int indice = 0; indice < suma_arreglos.length; indice++) {
            System.out.print(suma_arreglos[indice] +"\t");
        }
    }
}
