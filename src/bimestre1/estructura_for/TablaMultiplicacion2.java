package bimestre1.estructura_for;

import java.util.Scanner;

public class TablaMultiplicacion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();
        boolean interruptor = true;
        for (int contador = 10; contador >= 0 && interruptor == true; contador--){
            int mult = numero * contador;
            System.out.println(numero +" x "+ contador +" = "+ mult);
            if (contador == 5)
                interruptor = false;
        }
    }
}
