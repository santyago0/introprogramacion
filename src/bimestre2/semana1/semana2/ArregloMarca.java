package bimestre2.semana1.semana2;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * Programa que solicite el nombre de 'n' marcas de vehículos y las
 * almacene en un arreglo. Finalmente el programa debe mostrar el
 * nombre de las marcas almacenadas en un arreglo.
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("¿Cuántas marcas de vehículo va a ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine(); //para esperar un enter y no empiece el ciclo de repetición for
        marcas = new String[n]; //creamos el arreglo con 'n' elementos
        //OPERACIÓN ESCRITURA DEL ARREGLO
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println("Ingrese el nombre de la "+ (indice+1) +"ª marca: ");
            String marca = teclado.nextLine();
            marcas[indice] = marca.toUpperCase();
        }
        System.out.println("Lista de marcas ingresadas: ");
        //OPERACIÓN LECTURA DE UN ARREGLO
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.print(marcas[indice] +"\t");
        }
        System.out.println("");
        //OPERACIÓN DE BÚSQUEDA
        System.out.println("¿Qué marca desea buscar?");
        String marca_busqueda = teclado.nextLine().toUpperCase();
        //toUpperCase() es una función que convierte un texto en mayúsculas
        //otra opción es usar toLowerCase() que es una función que convierte un texto en minúscula
        System.out.println("marca_busqueda: "+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice])) {
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el índice: "+ indice);
                break;
            }
        }
    }
}
