package estructura_for;

import java.util.Scanner;

public class TablaAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingreses el número de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingreses el número de columnas: ");
        int columnas = teclado.nextInt();
        String fila_asterisco = "";
        for(int col = 1; col <= columnas; col++){ //para controlar el número de columnas
            fila_asterisco = fila_asterisco + "*";
        }
        for(int fila = 1; fila <= filas; fila++) { //para controlar el número de filas
            System.out.println(fila_asterisco);
        }
    }
}
