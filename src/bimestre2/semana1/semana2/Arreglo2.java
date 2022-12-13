package bimestre2.semana1.semana2;

public class Arreglo2 {
    public static void main(String[] args) {
        //creación de arreglos, sin valores predefinidos
        String universidades[] = new String[5];
        System.out.println("Arreglo universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.print(universidades[indice] +"\t");
        }
        System.out.println("");
        int notas[] = new int[4];
        System.out.println("Arreglo notas: ");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] +"\t");
        }
        System.out.println("");
        boolean valores[] = new boolean[10];
        System.out.println("Arreglo valores: ");
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice] +"\t");
        }
        //creación de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres[]; //declaración de un arreglo llamado nombres
        nombres = new String[10]; //creación del arreglo de 10 elementos
    }
}
