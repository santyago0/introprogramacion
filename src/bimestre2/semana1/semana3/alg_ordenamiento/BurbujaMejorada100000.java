package bimestre2.semana1.semana3.alg_ordenamiento;

public class BurbujaMejorada100000 {
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
        boolean bandera = true;
        for (int indice = 0; indice < numeros.length-1 && bandera == true; indice++) {
            bandera = false;
            for (int elemento = 0; elemento < numeros.length-indice-1; elemento++) {
                if (numeros[elemento] > numeros[elemento+1]) {
                    bandera = true;
                    int aux = numeros[elemento];
                    numeros[elemento] = numeros[elemento+1];
                    numeros[elemento+1] = aux;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");
        long fin = System.currentTimeMillis();
        float tiempo = fin-inicio;
        System.out.println(tiempo);
    }
}
