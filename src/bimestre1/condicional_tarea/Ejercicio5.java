package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar, de 3 números ingresados, si pueden ser las medidas de los lados de un triángulo rectángulo.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA SABER SI LOS 3 LADOS DE UN TRIÁNGULO SON O NO DE UN TRIÁNGULO RECTÁNGULO");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado: ");
        int lado1 = teclado.nextInt();
        System.out.println("Ingrese el valor del segundo lado: ");
        int lado2 = teclado.nextInt();
        System.out.println("Ingrese el valor del tercer lado: ");
        int lado3 = teclado.nextInt();
        if (lado1>lado2 && lado1>lado3 && lado1 == Math.sqrt(Math.pow(lado2, 2) + Math.pow(lado3, 2))){
            System.out.println("Si pueden ser los lados de un triángulo rectángulo");
        }else{
            if (lado2>lado1 && lado2>lado3 && lado2 == Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado3, 2))){
                System.out.println("Si pueden ser los lados de un triángulo rectángulo");
            }else{
                if (lado3>lado1 && lado3>lado2 && lado3 == Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2))) {
                    System.out.println("Si pueden ser los lados de un triángulo rectángulo");
                }else{
                    System.out.println("No pueden ser los lados de un triángulo rectángulo");
                }
            }
        }
    }
}
