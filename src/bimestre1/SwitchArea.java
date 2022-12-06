import java.util.Scanner;

/**
 * Programa para encontrar, dependiendo del número que ingrese, del 1 al 3 lo siguiente:
 * 1: El área de un triángulo
 * 2: El área de una circunferencia
 * 3: El área de un cuadrado
 */
public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 3");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor de la base: ");
                double base = teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura = teclado.nextDouble();
                double area_t = (base * altura)/2;
                System.out.println("El valor del área es: " +area_t);
                break;
            case 2:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextDouble();
                double area_C = (Math.pow(radio, 2) * Math.PI);
                System.out.println("El valor del área es: " +area_C);
                break;
            case 3:
                System.out.println("Ingrese el valor del lado: ");
                double lado = teclado.nextDouble();
                double area_c = (Math.pow(lado, 2));
                System.out.println("El valor del área es: " +area_c);
                break;
            default:
                System.out.println("No hay ejercicios asignados a esa opción");
        }
    }
}
