package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar la especificación que se debería asignar al componente según la tolerancia a componentes críticos.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR EL ESTADO DE LA ESPECIFICAIÓN SEGÚN LA TOLERANCIA");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su tolerancia: ");
        double tolerancia = teclado.nextDouble();
        if (tolerancia<0.1){
            System.out.println("Exploración espacial");
        }else{
            if(tolerancia>=0.1 && tolerancia<1){
                System.out.println("Grado militar");
            }else{
                if(tolerancia>=1 && tolerancia<10){
                    System.out.println("Grado comercial");
                }else{
                    if (tolerancia>=10){
                        System.out.println("Grado de juguete");
                    }
                }
            }
        }
    }
}
