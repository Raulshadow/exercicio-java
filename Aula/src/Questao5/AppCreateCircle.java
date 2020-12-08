package Questao5;

import java.util.Scanner;

public class AppCreateCircle {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Circulo circle = new Circulo();

        System.out.println("Digite o valor do raio:");
        circle.setRaio(dado.nextFloat());
        System.out.println("O circulo tem área de " + circle.area());

        dado.close();
    }
}
