package bimestre1;

public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("PRUBA DE OPERADORES LÓGICOS O BOOLEAN0S");
        boolean valor = (5 == 5); //operador relacional
        boolean valor_logico = ((5 == 5) || (4 >= 3)); //v o v = v
        boolean valor_logico_and = !(!(5 == 5) && !(4 >= 3)); //v and v = v
        System.out.println("valor: "+ valor);
        System.out.println("valor lógico: "+ valor_logico);
        System.out.println("valor lógico and: "+ valor_logico_and);
        System.out.println("negación de valor_logico: "+ !valor_logico);
    }
}
