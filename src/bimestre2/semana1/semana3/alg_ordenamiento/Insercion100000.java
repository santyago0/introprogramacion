package bimestre2.semana1.semana3.alg_ordenamiento;

public class Insercion100000 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        int numeros[] = new int[100000];
        for (int i = 100000, i2 = 0; i > 0; i--, i2++) {
            numeros[i2] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");
        for (int indice = 1; indice < numeros.length; indice++) {
            int clave = numeros[indice];
            int elemento = indice-1;
            while (elemento > -1 && numeros[elemento] > clave) {
                numeros[elemento+1] = numeros[elemento];
                elemento = elemento-1;
            }
            numeros[elemento+1] = clave;
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
