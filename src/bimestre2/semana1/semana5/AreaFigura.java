package bimestre2.semana1.semana5;

import java.util.Scanner;

/**
 * Programa para calcular las áreas de sistintas figuras según la opción ingresada:
 * 1. Obtener área de una circunferencia.
 * 2. Obetenre el área de un cuadrado.
 * 3. Obtener el área de un cilindro.
 */
public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL ÁREA DE FIGURAS GEOMÉTRICAS");
        System.out.println("Digite 1 para calcular el área de una circunferencia");
        System.out.println("Digite 2 para calcular el área de un cuadrado");
        System.out.println("Digite 3 para calcular el área de un cilindro");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
    }

    /**
     * Método para elegir la opción a realizar
     * @param opcion
     */
    public static void seleccionar_figura(int opcion) {
        Scanner teclado = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextDouble();
                double area = calcular_area_circunferencia(radio);
                System.out.println("El área es: "+area);
                break;
        }
    }

    /**
     * Método para calcular el área de una circunferencia
     * @param radio
     * @return
     */
    public static double calcular_area_circunferencia(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Métodod para calcular el área de un cuadrado
     * @param lado
     * @return
     */
    public static double calcular_area_cuadrado(double lado) {
        double area = lado * lado;
        return area;
    }

    /**
     * Método para calcular el área de un cilindro
     * @param radio
     * @param altura
     */
    public static void calcular_area_cilindro(double radio, double altura) {
        double area = ((2*Math.PI) * radio * altura) + ((2*Math.PI) * Math.pow(radio, 2));
    }
}
