package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar, al ingresar 2 números, si uno es divisor del otro.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR SI UN NÚMERO ES DIVISOR DE OTRO");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingres un número: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = teclado.nextInt();
        if (num1>num2){
            int residuo = num1%num2;
            if (residuo==0){
                System.out.println(num2+ " es divisor de " +num1);
            }else{
                System.out.println(num2+ " no es divisor de " +num1);
            }
        }else{
            int residuo = num2%num1;
            if (residuo==0){
                System.out.println(num1+ " es divisor de " +num2);
            }else{
                System.out.println(num1+ " no es divisor de " +num2);
            }
        }
    }
}
