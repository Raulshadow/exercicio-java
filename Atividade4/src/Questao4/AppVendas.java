package Questao4;

import java.util.Scanner;

public class AppVendas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        produto1.setNome("Bicicleta");
        produto2.setNome("Pneu");
        produto3.setNome("Sela");

        //produto1
        System.out.println("Digite o custo do " + produto1.getNome());
        produto1.setPrecoCusto(dado.nextFloat());
        System.out.println("Digite o venda do " + produto1.getNome());
        produto1.setPrecoVenda(dado.nextFloat());

        System.out.println("O lucro do " + produto1.getNome() + " é de " + produto1.getMargemLucro() + " R$");
        System.out.println("A porcentagem de lucro do " + produto1.getNome() + " é de " + produto1.getMargemLucroPorcentagem() + "%");

        //produto2
        System.out.println("Digite o custo do " + produto2.getNome());
        produto2.setPrecoCusto(dado.nextFloat());
        System.out.println("Digite o venda do " + produto2.getNome());
        produto2.setPrecoVenda(dado.nextFloat());

        System.out.println("O lucro do " + produto2.getNome() + " é de " + produto2.getMargemLucro() + " R$");
        System.out.println("A porcentagem de lucro do " + produto2.getNome() + " é de " + produto2.getMargemLucroPorcentagem() + "%");

        //produto3
        System.out.println("Digite o custo do " + produto3.getNome());
        produto3.setPrecoCusto(dado.nextFloat());
        System.out.println("Digite o venda do " + produto3.getNome());
        produto3.setPrecoVenda(dado.nextFloat());

        System.out.println("O lucro do " + produto3.getNome() + " é de " + produto3.getMargemLucro() + " R$");
        System.out.println("A porcentagem de lucro do " + produto3.getNome() + " é de " + produto3.getMargemLucroPorcentagem() + "%");
    }
}
