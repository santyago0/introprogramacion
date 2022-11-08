import java.util.Scanner;

/**
 * Programa para delvolver el día de la semana en palabras dado un número del 1 al 7
 * Creado por Santiago
 */
public class SeleccionSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Lunes");
                break; //salta al final de la estructura switch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        System.out.println("Fin del switch");
    }
}
