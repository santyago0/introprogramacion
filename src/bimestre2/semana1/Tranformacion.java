package bimestre2.semana1;

import java.util.Scanner;

/**
 * Codificar el algoritmo desarrollado como trabajo grupal
 */
public class Tranformacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int interruptor = 1;
        while (interruptor == 1) {
            System.out.println("Digite 1 para convertir un valor de MB a KB");
            System.out.println("Digite 2 para convertir un valor de KB a MB");
            System.out.println("Digite 3 para convertir un valor de MB a bits");
            System.out.println("Digite 4 para finalizar");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("CONVERTIR DE MB A KB");
                    System.out.println("Ingrese un valor en MB: ");
                    int valor_MB = teclado.nextInt();
                    int transformar_MBaKB = valor_MB * 1024;
                    System.out.println(valor_MB +"MB equivalen a "+ transformar_MBaKB +"KB");
                    break;
                case 2:
                    System.out.println("CONVERTIR DE KB A MB");
                    System.out.println("Ingrese un valor en KB: ");
                    double valor_KB = teclado.nextInt();
                    double transformar_KBaMB = valor_KB/1024;
                    System.out.println(valor_KB +"MB equivalen a "+ transformar_KBaMB +"KB");
                    break;
                case 3:
                    System.out.println("CONVERTIR DE MB A BITS");
                    System.out.println("Ingrese un valor en MB: ");
                    int valor_MB2 = teclado.nextInt();
                    int transformar_MBab = valor_MB2 * 1024 * 1024 * 8;
                    System.out.println(valor_MB2 +"MB equivalen a "+ transformar_MBab +"KB");
                    break;
                case 4:
                    System.out.println("FINALIZAR");
                    interruptor = 0;
                    break;
                default:
                    System.out.println("Error en datos");
            }
        }
    }
}
