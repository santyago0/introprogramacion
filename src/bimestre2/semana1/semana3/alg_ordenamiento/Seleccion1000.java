package bimestre2.semana1.semana3.alg_ordenamiento;

public class Seleccion1000 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        int numeros[] = new int[1000];
        for (int i = 1000, i2 = 0; i > 0; i--, i2++) {
            numeros[i2] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");
        for (int indice = 0; indice < numeros.length-1; indice++) {
            int min = indice;
            for (int elemento = indice+1; elemento < numeros.length; elemento++) {
                if (numeros[elemento] < numeros[min]) {
                    min = elemento;
                }
            }
            if (indice != min) {
                int aux = numeros[indice];
                numeros[indice] = numeros[min];
                numeros[min] = aux;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");
        long fin = System.currentTimeMillis();
        double tiempo = fin-inicio;
        System.out.println(tiempo);
    }
}
