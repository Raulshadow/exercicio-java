package Questao7;

import java.util.Scanner;

public class AppPrimos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Primos primo = new Primos();

        System.out.println("Digite um valor: ");
        primo.isCousin(dado.nextInt());
    }
}
