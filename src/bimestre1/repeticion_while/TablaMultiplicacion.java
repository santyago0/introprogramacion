package repeticion_while;

import javax.swing.JOptionPane;

/**
 * Generar la tabla de multiplicar hasta el 10 de un número ingresado por teclado
 */
public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        JOptionPane.showMessageDialog(null, "PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        //System.out.println("Ingrese un número: ");
        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int contador = 1;
        String acumulador = "";
        while (contador<=10){
            int mult = Integer.parseInt(num) * contador; //convertimos un valor String a int
            String salida = num + " x " + String.valueOf(contador) + " = " + String.valueOf(mult) + "\n"; //convertimos un valor de int a String
            acumulador = acumulador + salida;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}
