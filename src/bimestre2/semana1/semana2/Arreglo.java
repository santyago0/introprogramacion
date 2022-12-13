package bimestre2.semana1.semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creación de arreglos con valores predefinidos
        String universidades[] = {"utpl","unl","espol","ucuenca","usfq"};
        int tam = universidades.length; //obtenemos el tamaño del arreglo
        System.out.println("El tamaño del arreglo: "+ tam);
        for (int indice = 0; indice < tam; indice++) {
            System.out.print(universidades[indice] +"\t");
        }
        System.out.println("");
        //creación de un arreglo de tipo entero
        int notas[] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] +"\t");
        }
        System.out.println("");
        //creación de un arreglo de tipo char
        char vocales[] = {'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.print(vocales[indice] +"\t");
        }
        System.out.println("");
        //creación de un arreglo de tipo boolean
        boolean valores[] = {true, false, false, true, true};
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice] +"\t");
        }
        System.out.println("");
        //creación de un arreglo de tipo decimal
        double numeros[] = {1.0, 2.5, 3.1};
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print(numeros[indice] +"\t");
        }
    }
}
