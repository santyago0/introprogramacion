package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Programa para simulara todas las opciones de un cajero automático empleando variables
 * globales, locales y metodos que retornan valor.
 * El programa debe recivir el saldo inicial de la cuenta y posteriormente permitir
 * realizar las acciones de: consulta de saldo, retiros, depósitos y una opción
 * para salir. Luego de finalizar cada acción se debe preguntar repetidamente elegir
 * otra acción hasta que se elija “salir del programa”.
 */
public class Cajero {
    Scanner teclado = new Scanner(System.in);
    int saldo_inicial = teclado.nextInt();

    /**
     * Método para realizar un retiro
     * @param cantidad
     * @return saldo_inicial
     */
    public int retirar(int cantidad) {
        if (cantidad <= saldo_inicial && cantidad >0)
            saldo_inicial -= cantidad;
        else
            System.out.println("*CANTIDAD INCORRECTA*");
        return saldo_inicial;
    }

    /**
     * Método para realizar un depósito
     * @param cantidad
     * @return saldo_inicial
     */
    public int depositar(int cantidad) {
        if (cantidad > 0)
            saldo_inicial += cantidad;
        else
            System.out.println("*CANTIDAD INCORRECTA*");
        return saldo_inicial;
    }

    /**
     * Método para realizar una consulta de saldo
     * @return saldo_inicial
     */
    public int consultar_saldo() {
        System.out.println("El saldo actual de su cuenta es de: "+saldo_inicial);
        return saldo_inicial;
    }
    public void ejecutar() {
        boolean interruptor = true;
        while (interruptor) {
            System.out.println("Digite 1, para consultar su saldo: ");
            System.out.println("Digite 2, para realizar un retiro: ");
            System.out.println("Digite 3, para realizar un depósito: ");
            System.out.println("Digite 4, para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    consultar_saldo();
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    int retiro = teclado.nextInt();
                    retirar(retiro);
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que desea depositar: ");
                    int deposito = teclado.nextInt();
                    depositar(deposito);
                    System.out.println("------------------------------");
                    break;
                case 4:
                    System.out.println("*SALIR*");
                    interruptor = false;
                    break;
                default:
                    System.out.println("*OPCIÓN INCORRECTA*");
                    System.out.println("------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Cajero mivariable = new Cajero();
        mivariable.ejecutar();
    }
}
