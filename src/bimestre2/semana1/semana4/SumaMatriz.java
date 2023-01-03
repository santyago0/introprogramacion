package bimestre2.semana1.semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int A[][] = {
                {2,6,8},
                {7,2,5},
                {3,5,4}
        };
        int B[][] = {
                {3,1,6},
                {1,7,4},
                {6,8,2}
        };
        int filas = A.length;
        int columnas = A[0].length;
        int C[][] = new int[filas][columnas];
        //SUMA DE MATRICES A + B = C
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                C[fila][col] = A[fila][col] + B[fila][col];
            }
        }
        System.out.println("RESULTADO DE LA SUMA DE MATRICES: ");
        //MOSTRAR LOS ELEMENTOS DE LA MATRIZ C
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(C[fila][col] +"\t");
            }
            System.out.println();
        }
    }
}
