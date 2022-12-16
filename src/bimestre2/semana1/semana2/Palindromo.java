package bimestre2.semana1.semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SABER SI UNA PALABRA ES PALÍNDROMA");
        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.nextLine().toLowerCase();
        int tam_palabra = palabra.length(); //.length() función para saber el tamaño de una palabra
        //System.out.println("La palabra tiene "+ tam_palabra +" caracteres");
        char palabra_arr[] = new char[tam_palabra];
        //pasamos los caracteres de palabra al arreglo parabra_arr
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice] = palabra.charAt(indice);
        }
        //lectura del arreglo de derecha a izquierda
        String palabra_invertida = "";
        for (int indice = palabra_arr.length-1; indice >= 0; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        //determinamos si es palíndromo o no
        if (palabra.equals(palabra_invertida)) {
            System.out.println("Si es palíndroma");
        }else {
            System.out.println("No es palíndroma");
        }
        //for (int indice = 0; indice < palabra_arr.length; indice++) {
        //    System.out.print(palabra_arr[indice]);
        //}

    }
}
