package bimestre2.semana1.semana2;

import java.util.Scanner;

/**
 * Realizar un programa que solicite el ingreso de un número de cédula por teclado,
 * este se almacenará en un arreglo de 10 elementos. Una vez ingresado el número
 * de cédula, realizar el proceso correspondiente de verificación.
 * Finalmente presentar en pantalla al usuario si la verificación es correcta: "El
 * número de cédula es correcto", en caso contrario presentar: "Cédula incorrecta".
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA VERIFICAR SI UN NÚMERO DE CÉDULA ES CORRECTA");
        System.out.println("Ingrese su número de cédula: ");
        int cedula = teclado.nextInt();
        int tam_cedula = String.valueOf(cedula).length();
        String cedula_string = String.valueOf(cedula);
        //System.out.println("Digitos: "+ tam_cedula);
        String cedula_arr[] = cedula_string.split("(?<=.)");
        //for (int i = 0; i < cedula_arr.length; i++) {
        //    cedula_arr[i] = cedula;
        //}
        //for (int i = 0; i < cedula_arr.length; i++) {
        //    System.out.print(cedula_arr[i] +"\t");
        //}
        //System.out.println("");
        int coeficientes[] = {2,1,2,1,2,1,2,1,2};
        int resultado[] = new int[coeficientes.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = coeficientes[i] * Integer.parseInt(cedula_arr[i]);
            if (resultado[i] >= 10)
                resultado[i] = resultado[i] - 9;
        }
        //for (int i = 0; i < resultado.length; i++) {
        //    System.out.print(resultado[i] +"\t");
        //}
        //System.out.println("");
        int suma_resultado = 0;
        for (int i = 0; i < resultado.length; i++) {
            suma_resultado = suma_resultado + resultado[i];
        }
        //System.out.println(suma_resultado);
        int residuo = suma_resultado%10;
        if (residuo == 0){
            int verificador_1 = suma_resultado/10;
            //System.out.println(verificador_1);
            if (String.valueOf(verificador_1).equals(cedula_arr[9])) {
                System.out.println("El número de cédula es correcto");
            }else {
                System.out.println("Cédula incorrecta");
            }
        }else {
            int verificador_2 = 10 - residuo;
            //System.out.println(verificador_2);
            if (String.valueOf(verificador_2).equals(cedula_arr[9])) {
                System.out.println("El número de cédula es correcto");
            }else {
                System.out.println("Cédula incorrecta");
            }
        }
    }
}
