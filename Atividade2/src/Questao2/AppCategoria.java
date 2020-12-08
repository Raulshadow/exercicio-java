package Questao2;

import java.util.Scanner;

public class AppCategoria {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Nadador nadador = new Nadador();

        System.out.println("Digite a idade do nadador:");
        nadador.setIdade(dado.nextByte());

        System.out.println("A categoria do nadador é " + nadador.categoria());

        dado.close();
    }
}
