package bimestre2.semana1.semana4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Programa para crear una Matriz con valores recibidos desde el teclado, y
 * luego porder realizar repetitivamente las siguientes operaciones operaciones:
 * 1. Búsquedad
 * 2. Modificación
 * 3. Eliminación
 * 4. Visualización
 * 5. Salida
 */
public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int columnas = teclado.nextInt();
        teclado.nextLine();
        String marcas[][] = new String[filas][columnas]; //establecemos la dimensión de la matriz
        //LLENAR LA MATRIZ: operación de escritura
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese una marca para la posición ["+f+"]["+c+"]");
                marcas[f][c] = teclado.nextLine().toLowerCase();
            }
        }
        boolean salir = false;
        while (!salir) { //salir == false
            System.out.println("Digite 1 para realizar una búsquedad: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor:");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN BÚSQUEDAD");
                    System.out.println("¿Qué marca busca?");
                    String marca_buscar = teclado.nextLine().toLowerCase();
                    boolean encontrar = false;
                    for (int f = 0; f < filas; f++) {
                        for (int c = 0; c < columnas; c++) {
                            if (marcas[f][c].equals(marca_buscar)) {
                                System.out.println("Marca encontrada: "+ marca_buscar);
                                System.out.println("Se encuentra en la posición ["+f+"]["+c+"]");
                                encontrar = true;
                                break;
                            }
                        }
                    }
                    if (encontrar == false) {
                        System.out.println("MARCA NO ENCONTRADA");
                    }
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN DE MODIFICACIÓN");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila = teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int columna = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("¿Cuál es el nombre de la nueva marca?");
                    String new_marca = teclado.nextLine();
                    marcas[fila][columna] = new_marca;
                    break;
                case 3:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN DE ELIMINACIÓN");
                    System.out.println("¿Qué marca desea eliminar?");
                    String eliminar = teclado.nextLine().toLowerCase();
                    for (int f = 0; f < filas; f++) {
                        for (int c = 0; c < columnas; c++) {
                            if (marcas[f][c].equals(eliminar)) {
                                marcas[f][c] = "";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN DE LECTURA");
                    for (int f = 0; f < filas; f++) {
                        for (int c = 0; c < columnas; c++) {
                            System.out.print(marcas[f][c] +"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("HATA PRONTO");
                    salir = true;
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
                    salir = true;
            }
        }
    }
}
