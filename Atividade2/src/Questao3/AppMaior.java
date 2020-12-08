package Questao3;

import java.util.Scanner;

public class AppMaior {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Numeros numeros = new Numeros();

        System.out.println("Digite o primeiro número: ");
        numeros.setNum1(dado.nextFloat());
        System.out.println("Digite o segundo número: ");
        numeros.setNum2(dado.nextFloat());

        System.out.println("O maior valor é " +  numeros.comparador());

        dado.close();
    }
}
