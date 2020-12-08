package Questao6;

import java.util.Scanner;

public class AppQualDia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Semana dia = new Semana();

        System.out.println("Digite o número da semana (1 a 7): ");
        dia.setDia(dado.nextByte());
        System.out.println("O dia da semana é " + dia.diaDaSemana());

        dado.close();
    }
}
