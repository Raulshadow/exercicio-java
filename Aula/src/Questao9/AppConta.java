package Questao9;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o valor do salário mínimo:");
        conta.setSalarioMinimo(dado.nextFloat());
        System.out.println("Digite a quantidade de KW:");
        conta.setQuantidadeDeKw(dado.nextFloat());

        System.out.println("O valor de KW a partir do salario mínimo vale: " + conta.valorDeKw() + "R$");
        System.out.println("O valor da conta a ser pago é de: " + conta.valorDaConta() + "R$");
        System.out.println("O valor a ser pago da conta com descondo é de: "+ conta.contaComDesconto() + "R$");

        dado.close();
    }
}
