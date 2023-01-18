package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Cree un programa que le permita almacenar en un arreglo bidimensional 5 números
 * de cédula, estos deben ser ingresados desde el teclado. Luego realice un primer
 * método que no retorne valor y que reciba como entrada un número de cédula y
 * devuelva como resultado si válida o no.
 * Posteriormente realice un segundo método que reciba la matriz de cédulas y dentro
 * del método llame al metodo1 para validar cada una de las cédulas.
 */
public class NumeroCedula {
    Scanner teclado = new Scanner(System.in);

    /**
     * Método para verificar si un número de cédula es válido o no
     * @param cedula
     */
    public void validar_cedula(int cedula) {
        int tam_cedula = String.valueOf(cedula).length();
        String cedula_string = String.valueOf(cedula);
        String cedula_arr[] = cedula_string.split("(?<=.)");
        int coeficientes[] = {2,1,2,1,2,1,2,1,2};
        int resultado[] = new int[coeficientes.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = coeficientes[i] * Integer.parseInt(cedula_arr[i]);
            if (resultado[i] >= 10)
                resultado[i] = resultado[i] - 9;
        }
        int suma_resultado = 0;
        for (int i = 0; i < resultado.length; i++) {
            suma_resultado = suma_resultado + resultado[i];
        }
        int residuo = suma_resultado%10;
        if (residuo == 0){
            int verificador_1 = residuo;
            if (String.valueOf(verificador_1).equals(cedula_arr[9])) {
                System.out.println("El número de cédula es correcto");
            }else {
                System.out.println("Cédula incorrecta");
            }
        }else {
            int verificador_2 = 10 - residuo;
            if (String.valueOf(verificador_2).equals(cedula_arr[9])) {
                System.out.println("El número de cédula es correcto");
            }else {
                System.out.println("Cédula incorrecta");
            }
        }
    }

    /**
     * Método para almacenar 5 números de cédula
     */
    public void almacenar_cedulas() {
        int cedula_arr[][] = new int[5][1];
        for (int f = 0; f < cedula_arr.length; f++) {
            System.out.println("Ingrese la "+(f+1)+"ª cédula: ");
            int cedula = teclado.nextInt();
            for (int c = 0; c < cedula_arr[0].length; c++) {
                cedula_arr[f][c] = cedula;
                cedula = 0;
            }
        }
        System.out.println("------------------------------");
        for (int f = 0; f < cedula_arr.length; f++) {
            for (int c = 0; c < cedula_arr[0].length; c++) {
                System.out.print(cedula_arr[f][c]+"\t---> ");
                validar_cedula(cedula_arr[f][c]);
            }
        }
    }
    public void ejecutar() {
        almacenar_cedulas();
    }

    public static void main(String[] args) {
        NumeroCedula mivariable = new NumeroCedula();
        mivariable.ejecutar();
    }
}
