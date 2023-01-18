package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Programa para leer dos catetos y la hipotenusa de un triángulo, para que posteriormente
 * imprima el tipo de triángulo que es. Para ello, debe usar un método que reciba los catetos
 * y la hipotenusa y devuelva el tipo de triángulo que es.
 */
public class TipoTriangulo {
    Scanner teclado = new Scanner(System.in);

    /**
     * Método para saber si un triángulo es rectángulo, acutángulo u obtusángulo
     * @param hipotenusa
     * @param cateto_a
     * @param cateto_b
     */
    public void conocer_tipo_triangulo(double hipotenusa, double cateto_a, double cateto_b) {
        if (Math.pow(hipotenusa,2) == Math.pow(cateto_a,2) + Math.pow(cateto_b,2)) {
            System.out.println("Es un triángulo rectángulo");
        }else if (Math.pow(hipotenusa,2) < Math.pow(cateto_a,2) + Math.pow(cateto_b,2)) {
            System.out.println("Es un triángulo acutángulo");
        }else if (Math.pow(hipotenusa,2) > Math.pow(cateto_a,2) + Math.pow(cateto_b,2)) {
            System.out.println("Es un triángulo obtusángulo");
        }
    }
    public void ejecutar() {
        System.out.println("Ingrese el valor de la hipotenusa: ");
        double hipotenusa = teclado.nextDouble();
        System.out.println("Ingrese el valor de uno de los catetos: ");
        double cateto_a = teclado.nextDouble();
        System.out.println("Ingrese el valor del otro cateto: ");
        double cateto_b = teclado.nextDouble();
        conocer_tipo_triangulo(hipotenusa,cateto_a,cateto_b);
    }

    public static void main(String[] args) {
        TipoTriangulo mivariable = new TipoTriangulo();
        mivariable.ejecutar();
    }
}
