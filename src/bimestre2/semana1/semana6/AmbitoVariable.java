package bimestre2.semana1.semana6;

public class AmbitoVariable {
    static int numero = 10; //creación de variable global
    public static void cambiar_valor() {
        numero = numero + 15;
    }

    public void cambiar_valor(int numero) {
        this.numero = this.numero + numero;
    }

    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El nuevo valor del número = "+numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiar_valor(100);
        System.out.println("El nuevo valor del núemro = "+numero);
        int indice = 0;
        for (indice = 0; indice < 5; indice++) {
            System.out.println("Repetición: "+indice);
        }
        System.out.println("El valor final del índice: "+indice);
    }
}
