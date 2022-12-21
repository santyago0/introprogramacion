package bimestre2.semana1.semana3;

import java.util.Scanner;

/**
 * Buscar por número de cuenta para poder realizar:
 * - Depósito
 * _ Retiros
 * _ Consulta de saldo
 * Arreglos dados: socios, cuentas, saldos.
 */
public class CuentaBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String socios[] = {"Pablo","Iván","Richar","Andy","David"};
        int cuentas[] = {1234,4567,8910,1112,1314};
        int saldos[] = {1200,5000,3000,2500,10000};
        boolean interruptor = true;
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese su número de cuenta: ");
        int cuenta = teclado.nextInt();
        int posicion = 0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == cuenta) {
                System.out.println("Cuenta ingresada correctamente");
                posicion = i;
                System.out.println("Hola "+ socios[posicion]);
            }
        }
        if (cuentas[posicion] != cuenta) {
            System.out.println("Cuenta incorrecta");
            interruptor = false;
        }
        while (interruptor == true) {
            System.out.println("¿Qué desea realizar?");
            System.out.println("Para un DEPÓSITO, pulse 1");
            System.out.println("Para hacer un RETIRO, pulse 2");
            System.out.println("Para hacer una CONSULTA DE SALDO, pulse 3");
            System.out.println("Para SALIR, pulse 4");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad del depósito: ");
                    int deposito = teclado.nextInt();
                    saldos[posicion] = saldos[posicion] + deposito;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    int retiro = teclado.nextInt();
                    if (retiro > saldos[posicion]) {
                        System.out.println("Operación no posible");
                    }
                    saldos[posicion] = saldos[posicion] - retiro;
                    break;
                case 3:
                    System.out.println("Su saldo es de: ");
                    System.out.println(saldos[posicion]);
                    break;
                default:
                    System.out.println("PROGRAMA FINALIZADO");
                    interruptor = false;
            }
        }
    }
}
