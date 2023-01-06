package bimestre2.semana1.semana4;

/**
 * Programa para calcular el promedio de los elementos de una Matriz dada.
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros[][] = {
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        int suma_total = 0;
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[0].length; c++) {
                //suma_total = suma_total + numeros[f][c];
                suma_total += numeros[f][c];
            }
        }
        int nro_elementos = numeros.length* numeros[0].length;
        double promedio = (double) suma_total/(double) nro_elementos;
        System.out.println("La suma es: "+ suma_total);
        System.out.println("El promedio es: "+ promedio);
    }
}
