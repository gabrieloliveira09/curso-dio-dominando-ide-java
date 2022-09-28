package Projetos;

public class Calculadora {

    public static void soma(double number1, double number2) {

        double resultado = number1 + number2;

        System.out.println( " A soma de: " + number1 + " mais "  + number2 + " é igual a: " + resultado );
    }

    public static void subtracao(double number1, double number2) {

        double resultado = number1 - number2;

        System.out.println( " A subtracao de: " + number1 + " mais "  + number2 + " é igual a: " + resultado );
    }

    public static void multiplicacao(double number1, double number2) {

        double resultado = number1 * number2;

        System.out.println( " A multiplicacao de: " + number1 + " mais "  + number2 + " é igual a: " + resultado );
    }

    public static void divisao(double number1, double number2) {

        double resultado = number1 / number2;

        System.out.println( " A divisao de: " + number1 + " mais "  + number2 + " é igual a: " + resultado );
    }

}

