package bimestre2.semana1.semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRMA PARA SUMAR DOS NÚMEROS");
        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2,6); //llamamos al método y recibimos el valor
        System.out.println("La suma es: "+resultado);
        //sumar(num1, num2);
        //obtener el promedio de los números ingresados
        double promedio = obtener_promedio(resultado, 3);
        System.out.println("El promedio de los números es: "+promedio);
    }

    /**
     * Este método realiza la suma de dos números enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }

    /**
     * Sumar tres números enteros
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public static int sumar(int n1, int n2, int n3) {
        int resultado = n1 + n2 + n3;
        return resultado;
    }

    /**
     * Método para obtener el promedio de una suma de valores
     * @param suma_total
     * @param cantidad_num
     * @return promedio
     */
    public static double obtener_promedio(int suma_total, int cantidad_num) {
        double promedio = (double)suma_total/(double)cantidad_num;
        return promedio;
    }
}
