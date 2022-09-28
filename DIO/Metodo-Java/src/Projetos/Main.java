package Projetos;

public class Main {

    public static void main(String[] args) {

        // Calculadora
       System.out.println("Exercício da calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        //Mensagem da hora do dia
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        // Empréstimo
        System.out.println("Exercício do empréstimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}