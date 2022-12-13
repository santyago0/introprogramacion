package bimestre1.ejercicio_final;

import java.util.Scanner;

/**
 * Realice un programa que solicite una fecha de nacimieto en (años, meses, días
 * y horas) y en base a la fecha y hora actual, realizar el cálculo de la
 * edad en: años, meses, días y horas. Tener en cuenta años bisiestos
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CÁLCULO DE EDAD");
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.print("Día: ");
        int dia_n = teclado.nextInt();
        System.out.print("Mes: ");
        int mes_n = teclado.nextInt();
        System.out.print("Año: ");
        int anio_n = teclado.nextInt();
        System.out.println("Ingrese la fecha actual: ");
        System.out.print("Día: ");
        int dia = teclado.nextInt();
        System.out.print("Mes: ");
        int mes = teclado.nextInt();
        System.out.print("Año: ");
        int anio = teclado.nextInt();
        System.out.println("Ingrese la hora actual: ");
        int hora = teclado.nextInt();
        int seguir = 1;
        if(anio_n>0 && anio_n<=2022){
            switch (mes_n){
                case 1, 3, 5, 7, 8, 10, 12:
                    if(dia_n>0 && dia_n<=31){
                    }else{
                        seguir = 0;
                    }
                    break;
                case 2:
                    if(anio_n%4 == 0 && anio_n%100 != 0 || anio_n%400 == 0){
                        if(dia_n>0 && dia_n<=29){
                        }else{
                            seguir = 0;
                        }
                    }else{
                        if(dia_n>0 && dia_n<=28){
                        }else{
                            seguir = 0;
                        }
                    }
                    break;
                case 4, 6, 9, 11:
                    if(dia_n>0 && dia_n<=30){
                    }else{
                        seguir = 0;
                    }
                    break;
                default:
                    seguir = 0;
            }
        }else{
            seguir = 0;
        }
        if(anio>0 && anio<=2022){
            switch(mes){
                case 1, 3, 5, 7, 8, 10, 12:
                    if(dia>0 && dia<=31){
                    }else{
                        seguir = 0;
                    }
                    break;
                case 2:
                    if(anio%4 == 0 && anio%100 != 0 || anio%400 == 0){
                        if(dia>0 && dia<=29){
                        }else{
                            seguir = 0;
                        }
                    }else{
                        if(dia>0 && dia<=28){
                        }else{
                            seguir = 0;
                        }
                    }
                    break;
                case 4, 6, 9, 11:
                    if(dia>0 && dia<=30){
                    }else{
                        seguir = 0;
                    }
                    break;
                default:
                    seguir = 0;
            }
        }else{
            seguir = 0;
        }
        if(seguir == 1){
            int cont_dia = dia_n;
            int cont_mes = mes_n;
            int cont_anio = anio_n;
            int acu_dia = 0;
            int acu_mes = 0;
            int acu_anio = 0;
            while (anio_n < anio) {
                while (mes_n < mes) {
                    switch (cont_mes) {
                        case 1, 3, 5, 7, 8, 10, 12:
                            while (cont_dia < 31) {
                                while (cont_dia <= 31) {
                                    cont_dia++;
                                }
                                acu_dia = acu_dia + (cont_dia - 1);
                            }
                            if (cont_mes > 12)
                                cont_mes = 0;
                            acu_mes++;
                            break;
                        case 2:
                            if (anio_n%4 == 0 && anio_n%100 != 0 || anio_n%400 == 0) {
                                while (cont_dia < 29) {
                                    while (cont_dia <= 29) {
                                        cont_dia++;
                                    }
                                    acu_dia = acu_dia + (cont_dia - 1);
                                }
                            } else {
                                while (cont_dia < 28) {
                                    while (cont_dia <= 28) {
                                        cont_dia++;
                                    }
                                    acu_dia = acu_dia + (cont_dia - 1);
                                }
                            }
                            if (cont_mes > 12)
                                cont_mes = 0;
                            acu_mes++;
                            break;
                        case 4, 6, 9, 11:
                            while (cont_dia < 30) {
                                while (cont_dia <= 30) {
                                    cont_dia++;
                                }
                                acu_dia = acu_dia + (cont_dia - 1);
                            }
                            if (cont_mes > 12)
                                cont_mes = 0;
                            acu_mes++;
                            break;
                    }
                    if (cont_dia<=32 || cont_dia<=31 || cont_dia<=30 || cont_dia<=29)
                        cont_dia = 0;
                    mes_n++;
                }
                anio_n++;
                acu_anio++;
            }
            int bisiesto = 0;
            while (cont_anio < anio) {
                if (cont_anio%4 == 0 && cont_anio%100 != 0 || cont_anio%400 == 0)
                    bisiesto++;
                cont_anio++;
            }
            int resta_h = 24 - hora;
            int ed_meses = acu_anio * 12;
            int ed_dias = (acu_anio * 365) + bisiesto;
            int ed_horas = ((ed_dias + acu_dia) * 24) + resta_h;
            System.out.println("Tiene " + acu_anio + " años de edad");
            System.out.println(acu_mes + ed_meses + " meses de edad");
            System.out.println(acu_dia + ed_dias + " días de edad");
            System.out.println(ed_horas + " horas de edad");
        }else{
            System.out.println("Ingresó fechas incorrectas, vuelva a iniciar el programa");
        }
    }
}
