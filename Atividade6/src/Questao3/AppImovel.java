package Questao3;

import java.util.Scanner;

public class AppImovel {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite 1 para imóvel novo e 2 para imóvel velho.");
        switch (dado.nextInt()) {
            case 1:
                ImovelNovo novo = new ImovelNovo();
                System.out.println("Digite o endereço do imóvel ");
                novo.setEndereco(dado.next());
                System.out.println("Digite o preço do imóvel ");
                novo.setPrice(dado.nextFloat());
                System.out.println("O valor final do imóvel é de " + novo.getPrice());
                novo.printValoriza();
                break;

            case 2:
                ImovelVelho velho = new ImovelVelho();
                System.out.println("Digite o endereço do imóvel ");
                velho.setEndereco(dado.next());
                System.out.println("Digite o preço do imóvel ");
                velho.setPrice(dado.nextFloat());
                System.out.println("O valor final do imóvel é de " + velho.getPrice());
                velho.printDesconto();
                break;

            default:
                System.out.println("ERRO Tipo de imóvel não definido!");
                break;
        }
    }
}
