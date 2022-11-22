package repeticion_while;

import javax.swing.JOptionPane;

/**
 * Programa para realizar la suma de los números pares del 1 al 100
 */
public class SumaPares {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "SUMA DE LOS NÚMEROS PARES DEL 1 AL 100");
        int num = 1;
        int suma_pares = 0;
        while (num<=100){
            if (num%2 == 0){
                suma_pares = suma_pares + num;
            }
            num++; //num = num + 1;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números es: " +suma_pares);
    }
}
