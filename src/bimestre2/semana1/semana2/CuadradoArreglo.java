package bimestre2.semana1.semana2;

import java.util.Scanner;

public class CuadradoArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA PRESENTAR LOS CUADRADOS DE UN ARREGLO DADO");
        double numeros[] = {2,3,5,7,9,11,13};
        double cuadrados[] = new double[numeros.length];
        for (int indice = 0; indice < cuadrados.length; indice++) {
            cuadrados[indice] = Math.pow(numeros[indice], 2);
        }
        for (int indice = 0; indice < cuadrados.length; indice++) {
            System.out.println(cuadrados[indice]);
        }
    }
}
