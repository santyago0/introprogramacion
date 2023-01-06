package bimestre2.semana1.semana4;

import java.util.Scanner;

/**
 * Programa para elevar a una potencia dada los elementos de la Matriz
 */
public class PotenciaMatriz {
    public static void main(String[] args) {
        int numeros[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; //dimensión de la matriz 3x3
        int filas = numeros.length;
        int columnas = numeros[0].length;
        int mat_potencia[][] = new int[filas][columnas];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                mat_potencia[f][c] = (int) Math.pow(numeros[f][c], potencia);
                //Lectura de la matriz mat_potencia
                System.out.print(mat_potencia[f][c] +"\t");
            }
            System.out.println();
        }
    }
}
