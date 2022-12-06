package condicional_tarea;

import java.util.Scanner;

/**
 * Programa para determinar, dada una fecha del 01/01/1990 al 31/12/2010; si es válida o inválida.
 * Teniendo en cuenta los años bisiestos.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR SI UNA FECHA ES VÁLIDA O NO");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una fecha:");
        System.out.println("Día: ");
        int dia = teclado.nextInt();
        System.out.println("Mes: ");
        int mes = teclado.nextInt();
        System.out.println("Año: ");
        int año = teclado.nextInt();
        if (año>=1990 && año<=2010){
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia>0 && dia<=31){
                        System.out.println("Fecha válida");
                    }else{
                        System.out.println("Fecha no válida");
                    }
                    break;
                case 2:
                    if (año==1992 || año==1996 || año==200 || año==2004 || año==2008){
                        if (dia>0 && dia<=29){
                            System.out.println("Fecha válida");
                        }else{
                            System.out.println("Fecha no válida");
                        }
                    }else{
                        if (dia>0 && dia<=28){
                            System.out.println("Fecha válida");
                        }else{
                            System.out.println("Fecha no válida");
                        }
                    }
                    break;
                case 4, 6, 9, 11:
                    if (dia>0 && dia<=30){
                        System.out.println("Fecha válida");
                    }else{
                        System.out.println("Fecha no válida");
                    }
                    break;
                default:
                    System.out.println("Fecha no válida");
            }
        }else{
            System.out.println("Fecha no válida");
        }
    }
}
