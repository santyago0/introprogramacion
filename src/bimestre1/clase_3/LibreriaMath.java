package bimestre1.clase_3;

/**
 * Esta clase sirve para mostrar el funcionamiento de la librería en java
 * misma que sirve para trabajar con funciones de tipo matemático
 */
public class LibreriaMath {
    public static void main(String[] args) {
        double numero = 9;
        //Función para calcular la raíz cuadrada de un número
        System.out.println("Cálculo de la raíz cuadrada");
        double raiz = Math.sqrt(numero);
        System.out.println("El resultado de la raíz es: " + raiz);
        //Función para calcular la potencia de un número
        System.out.println("Calculo de la potencia de un número");
        double exponente = 3;
        double potencia = Math.pow(numero, exponente);
        System.out.println("El resultado del número elevado al cuadrado es: " + potencia);
        //Teorema de Pitágoras
        int a = 4;
        int b = 3;
        double c;
        c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
        System.out.println("La hipotenusa es: " + c);
    }
}
