package bimestre1.clase_3;

import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {
        //Uso de tipos de datos en java
        //Todo lo que se coloca entre comillas en java, es un texto
        String nombre_estudiante = "Santiago Riofrío"; //Variable de tipo texto
        int edad = 19;
        boolean valor = true;
        System.out.println("valor de variable nombre_estudiante = " + nombre_estudiante);
        System.out.println("valor de la variable edad = " + edad);
        System.out.println("valor de la variable valor = " + valor);
        //USO DE LOS OPERADORES ARITMÉTICOS
        System.out.println("USO DE LOS OPERADORES ARITMÉTICOS");
        Scanner teclado = new Scanner(System.in);//Variable para receptar valores desde el teclado
        System.out.println("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.println("Número 1 = " + numero1);
        System.out.println("Número 2 = " + numero2);
        System.out.println("OPERACIÓN SUMA");
        int suma = (numero1 + numero2);
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("OPERACIÓN RESTA");
        System.out.println("Resultado de la resta: " + (numero1 - numero2));
        System.out.println("OPERACIÓN MULTIPLICACIÓN");
        System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
        System.out.println("OPERACIÓN DIVISIÓN");
        System.out.println("Resultado de la división: " + (numero1 / numero2));
        System.out.println("OPERACIÓN RESIDUO");
        System.out.println("Resultado del residuo: " + (numero1 % numero2));//Obtenemos el residuo de la división
        System.out.println("Ingresa tus nombres completos");
        teclado.next();
        String nombres_completos = teclado.nextLine();
        System.out.println("Nombre ingresado= " + nombres_completos);
    }
}
