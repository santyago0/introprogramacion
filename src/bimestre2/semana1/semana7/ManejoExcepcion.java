package bimestre2.semana1.semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAMA PARA REALIZAR LA DIVISIÓN ENTRE DOS NÚMEROS
 */
public class ManejoExcepcion {
    //creación de variables globales
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivariable = new ManejoExcepcion();
        mivariable.ejecutar();
    }
    public void ejecutar() {
        ingresar_datos();
        System.out.println("Resultado: "+dividir());
    }
    public void ingresar_datos() {
        //el bloque try nos ayuda a captar o detectar si ocurre un excapción
        try { //este código tiene la posobilidad de presentar un excepción
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numerador: ");
            n1 = teclado.nextDouble();
            System.out.println("Ingrese el denominador: ");
            n2 = teclado.nextDouble();
        }catch (Exception error_de_teclado) {
            System.out.println("Manejo de la excepción de tipoo aritmético");
            System.out.println(error_de_teclado.getMessage());
        }
    }
    public double dividir() {
        double resultado = 0;
        try {
            //código en el que posiblemente puede ocurrir una excepción
            resultado = n1/n2;
            return resultado;
        } catch (Exception error) {
            //este código se ejecuta solo si ocurre una excepción
            System.out.println("Error de tipo artimético");
            System.out.println(error.getMessage());
        }finally {
            //este código se ejecuta ocurra o no la excepción
            System.out.println("Ingresó a finally");
        }
        System.out.println("Resultado: "+resultado);
        return resultado;
    }
}
