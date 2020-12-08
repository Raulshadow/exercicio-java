package Questao4;

import java.util.Scanner;

public class AppMedia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Numbers numbers = new Numbers();

        System.out.println("Digite 3 valores(um em cada linha):");
        numbers.setNum1(dado.nextFloat());
        numbers.setNum2(dado.nextFloat());
        numbers.setNum3(dado.nextFloat());

        System.out.println("Média = " + numbers.media());
        dado.close();
    }
}
