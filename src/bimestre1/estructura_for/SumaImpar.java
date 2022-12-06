package estructura_for;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número límite: ");
        int limite = teclado.nextInt();
        int suma_impares = 0;
        for (int contador = 1; contador <= limite; contador+=2){
            suma_impares = suma_impares + contador;
        }
        System.out.println("La suma de los números impares = "+ suma_impares);
    }
}
