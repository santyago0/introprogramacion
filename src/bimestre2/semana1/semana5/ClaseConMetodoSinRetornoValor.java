package bimestre2.semana1.semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoValor llamada = new ClaseConMetodoSinRetornoValor();
        //llamada.saludar();
        //saludar();
        //saludar("santiago");
        saludar("santiago", 10);
    }
    public static void saludar() {
        System.out.println("BIENVENIDO A LA CREACIÓN DE MÉTODOS");
        System.out.println("Método creado en java");
    }
    public static void saludar(String nombre) {
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACIÓN DE MÉTODOS");
        System.out.println("Método creado en java");
    }
    public static void saludar(String nombre, String apellido) {
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" "+apellido.toUpperCase()+" A LA CREACIÓN DE MÉTODOS");
        System.out.println("Método creado en java");
    }
    public static void saludar(String nombre, int edad) {
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACIÓN DE MÉTODOS");
        System.out.println("Método creado en java");
        System.out.println("Tú edad es: "+edad);
    }
}
