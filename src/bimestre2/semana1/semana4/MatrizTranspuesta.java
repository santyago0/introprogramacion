package bimestre2.semana1.semana4;

/**
 * Programa para generar la transpuesta de una Matriz.
 */
public class MatrizTranspuesta {
    public static void main(String[] args) {
        char letras[][] = {
                {'a','b','c'},
                {'d','e','f'}
        }; //dimensión 2x3
        int filas = letras.length; //2
        int columnas = letras[0].length; //3
        char transpuesta[][] = new char[columnas][filas];
        for (int f = 0; f < columnas; f++) {
            for (int c = 0; c < filas; c++) {
                transpuesta[f][c] = letras[c][f];
                System.out.print(transpuesta[f][c] +"\t");
            }
            System.out.println();
        }
    }
}
