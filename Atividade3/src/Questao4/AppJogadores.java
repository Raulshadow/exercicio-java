package Questao4;

import java.util.Scanner;

public class AppJogadores {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Jogadores jogador1 = new Jogadores();
        Jogadores jogador2 = new Jogadores();
        Jogadores jogador3 = new Jogadores();
        Jogadores jogador4 = new Jogadores();
        Jogadores jogador5 = new Jogadores();
        Ficha ficha = new Ficha();

        //jogador 1
        System.out.println("Digite o nome do jogador 1");
        jogador1.setNome(dado.next());
        System.out.println("Digite a idade do jogador 1");
        jogador1.setIdade(dado.nextByte());
        System.out.println("Digite o peso do jogador 1");
        jogador1.setPeso(dado.nextFloat());

        //jogador 2
        System.out.println("Digite o nome do jogador 2");
        jogador2.setNome(dado.next());
        System.out.println("Digite a idade do jogador 2");
        jogador2.setIdade(dado.nextByte());
        System.out.println("Digite o peso do jogador 2");
        jogador2.setPeso(dado.nextFloat());

        //jogador 3
        System.out.println("Digite o nome do jogador 3");
        jogador3.setNome(dado.next());
        System.out.println("Digite a idade do jogador 3");
        jogador3.setIdade(dado.nextByte());
        System.out.println("Digite o peso do jogador 3");
        jogador3.setPeso(dado.nextFloat());

        //jogador 4
        System.out.println("Digite o nome do jogador 4");
        jogador4.setNome(dado.next());
        System.out.println("Digite a idade do jogador 4");
        jogador4.setIdade(dado.nextByte());
        System.out.println("Digite o peso do jogador 4");
        jogador4.setPeso(dado.nextFloat());

        //jogador 5
        System.out.println("Digite o nome do jogador 5");
        jogador5.setNome(dado.next());
        System.out.println("Digite a idade do jogador 5");
        jogador5.setIdade(dado.nextByte());
        System.out.println("Digite o peso do jogador 5");
        jogador5.setPeso(dado.nextFloat());

        ficha.fichaJogadores(jogador1,jogador2,jogador3,jogador4,jogador5);
    }
}
