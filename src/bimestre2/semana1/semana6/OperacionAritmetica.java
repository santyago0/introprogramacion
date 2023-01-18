package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Programa para crear métodos para realizar operaciones aritméticas
 */
public class OperacionAritmetica {
    //Creación de variables globales
    int n1;
    int n2;

    /**
     * Método para realizar la suma de 2 números enteros
     * @param n1
     * @param n2
     * @return n1 + n2
     */
    public int sumar(int n1, int n2) {
        return (n1 + n2);
    }

    /**
     * Método para realizar la resta de 2 números enteros
     * @param n1
     * @param n2
     * @return
     */
    public int restar(int n1, int n2) {
        return (n1 - n2);
    }

    /**
     * Método para multiplicar 2 números enteros. No retorna valor
     * @param n1
     * @param n2
     */
    public void multiplicar(int n1, int n2) {
        System.out.println("La multiplicación es: "+(n1 * n2));
    }

    /**
     * Método para dividir 2 núemro enteros. NO retorna valor
     */
    public void dividir() {
        if (n2 > 0) {
            System.out.println("La división es: "+(double)(n1/n2));
        }else {
            System.out.println("División entre 0 no existe");
        }
    }
    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor) {
            System.out.println("Digite 1, para sumar dos núemros: ");
            System.out.println("Digite 2, para restar dos núemros: ");
            System.out.println("Digite 3, para multiplicar dos núemros: ");
            System.out.println("Digite 4, para dividir dos núemros: ");
            System.out.println("Digite 0, para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: "+sumar(n1, n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+restar(n1, n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1, n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                case 0:
                    System.out.println("SALIR");
                    interruptor = false;
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
        }
    }
    public void ingresar_numeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2 = teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}
