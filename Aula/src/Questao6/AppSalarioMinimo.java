package Questao6;

import java.util.Scanner;

public class AppSalarioMinimo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Funcionario empregado = new Funcionario();
        Salario salario = new Salario();

        System.out.println("Digite o valor do salário mínimo:");
        salario.setSalarioMinimo(dado.nextFloat());

        System.out.println("Digite o valor do salario do funcionário:");
        empregado.setSalarioAtual(dado.nextFloat());
        salario.setSalarioRecebido(empregado.getSalarioAtual());

        System.out.println("Ele possui " + salario.mediaSalarial() + " salários mínimos");
        dado.close();
    }
}
