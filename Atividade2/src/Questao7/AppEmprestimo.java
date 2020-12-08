package Questao7;

import java.util.Scanner;

public class AppEmprestimo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Emprestimo cliente = new Emprestimo();

        System.out.println("Digite o seu salário bruto: ");
        cliente.setSalarioBruto(dado.nextFloat());
        System.out.println("Digite o valor dos descontos: ");
        cliente.setDesconto(dado.nextFloat());
        System.out.println("Digite o valor do Empréstimo desejado: ");
        cliente.setValorDeEmprestimo(dado.nextFloat());

        System.out.println(cliente.emprestimo());
        dado.close();
    }
}
