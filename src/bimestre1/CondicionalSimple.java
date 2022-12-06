import java.util.Scanner;

/**
 * Programa para determinar si una persona es mayor de edad
 */
public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORÍA DE EDAD");
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        boolean evaluacion = (edad >= 18);
        if (evaluacion){
            System.out.println("Eres mayor de edad");
            System.out.println("Estás caso listo para ir a la universidad");
        }
    }
}
