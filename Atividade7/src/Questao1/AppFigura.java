package Questao1;

import java.util.Scanner;

public class AppFigura {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Figura f = new Figura();

        System.out.println("Digite a figura a qual deseja saber a área: ");
        switch (dado.next()) {
            case "Círculo":
                f = new Circulo();
                System.out.println(f.calcularArea());
                break;

            case "Quadrado":
                f = new Quadrado();
                System.out.println(f.calcularArea());
                break;

            case "Triângulo":
                f = new Triangulo();
                System.out.println(f.calcularArea());
                break;

            default:
                break;
        }
    }
}
