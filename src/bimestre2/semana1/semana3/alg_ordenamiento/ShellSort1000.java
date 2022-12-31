package bimestre2.semana1.semana3.alg_ordenamiento;

public class ShellSort1000 {
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
        for (int salto = numeros.length / 2; salto != 0; salto /= 2) {
            boolean cambio = true;
            while (cambio) {
                cambio = false;
                for (int i = salto; i < numeros.length; i++) {
                    if (numeros[i - salto] > numeros[i]) {
                        int aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = aux;
                        cambio = true;
                    }
                }
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
