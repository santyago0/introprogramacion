package bimestre2.semana1.semana3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numeros[] = {20,10,5,3,2,1};
        //contolamos el número de pasadas generales
        for (int indice = 1; indice < numeros.length; indice++) {
            for (int elemento = 0; elemento < numeros.length-1; elemento++) {
                //verificar si realizamos un intercambio
                if (numeros[elemento] > numeros[elemento+1]) {
                    int aux = numeros[elemento];
                    numeros[elemento] = numeros[elemento+1];
                    numeros[elemento+1] = aux;
                }
            }
        }
        //mostrar arreglo ordenado
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print(numeros[indice] +"\t");
        }
    }
}
