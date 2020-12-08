package Questao2;

import java.util.Scanner;

public class AppValores {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Valores numeros = new Valores();

        System.out.println("Digite os 3 números(um por linha)");
        numeros.setNum1(dado.nextInt());
        numeros.setNum2(dado.nextInt());
        numeros.setNum3(dado.nextInt());

        System.out.print(numeros.getNum3());
        System.out.print(numeros.getNum2());
        System.out.print(numeros.getNum1());
        dado.close();
    }
}
