package Questao4;

import java.util.Scanner;

public class AppComparativo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Numbers numbers = new Numbers();

        System.out.println("Digite o primeiro número: ");
        numbers.setNum1(dado.nextFloat());
        System.out.println("Digite o segundo número: ");
        numbers.setNum2(dado.nextFloat());
        System.out.println("Digite o terceiro número: ");
        numbers.setNum3(dado.nextFloat());

        System.out.println("A ordem crescente ");
        System.out.println(numbers.menor() + " " + numbers.meio() + " " + numbers.maior());
        System.out.println("A ordem decrescente ");
        System.out.println(numbers.maior() + " " + numbers.meio() + " " + numbers.menor());
    }
}
