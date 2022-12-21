package bimestre2.semana1.semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        int cont_datos = 0;
        String estudiantes[] = new String[100];
        int edades[] = new int[100];
        String universidades[] = new String[100];
        while (interruptor == true) {
            System.out.println("Ingrese el nombre de un estudiante: ");
            estudiantes[cont_datos] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edades[cont_datos] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese las iniciales de la universidad en la que estudia: ");
            universidades[cont_datos] = teclado.nextLine();
            cont_datos++;
            System.out.println("¿Desea ingresar los datos de otro estudiante? SI o NO");
            String desicion = teclado.nextLine().toLowerCase();
            if (desicion.equals("si")) {
                interruptor = true;
            } else {
                interruptor = false;
            }
        }
        System.out.println("");
        //ORDENAR ARREGLO POR EDAD
        System.out.println("ORDENAR ARREGLO POR EDAD");
        for (int indice = 1; indice < edades.length; indice++) {
            for (int elemento = 0; elemento < edades.length-1; elemento++) {
                //verificar si realizamos un intercambio
                if (edades[elemento] > edades[elemento+1]) {
                    int aux = edades[elemento];
                    edades[elemento] = edades[elemento+1];
                    edades[elemento+1] = aux;
                    //proceso de intercambio en arreglo estudiantes
                    String aux_n = estudiantes[elemento];
                    estudiantes[elemento] = estudiantes[elemento+1];
                    estudiantes[elemento+1] = aux_n;
                    //proceso de intercambio en arreglo universidades
                    String aux_u = universidades[elemento];
                    universidades[elemento] = universidades[elemento+1];
                    universidades[elemento+1] = aux_u;
                }
            }
        }
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("Nombre: " + estudiantes[i]);
                System.out.println("Edad: " + edades[i]);
                System.out.println("Universidad: " + universidades[i]);
                System.out.println("");
            }
        }
    }
}
