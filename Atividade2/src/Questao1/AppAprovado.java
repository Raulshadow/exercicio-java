package Questao1;

import java.util.Scanner;

public class AppAprovado {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite a nota 1:");
        aluno.setNota1(dado.nextFloat());
        System.out.println("Digite a nota 2:");
        aluno.setNota2(dado.nextFloat());
        System.out.println("Digite a nota 3:");
        aluno.setNota3(dado.nextFloat());

        System.out.println("A média foi " + aluno.media());
        System.out.println("Status do aluno: " + aluno.aprovado());

        dado.close();
    }
}
