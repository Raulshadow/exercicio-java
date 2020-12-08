package Questao8;

import java.util.Scanner;

public class AppVerificaTriangulo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o primeiro lado:");
        triangulo.setLado1(dado.nextFloat());
        System.out.println("Digite o segundo lado:");
        triangulo.setLado2(dado.nextFloat());
        System.out.println("Digite o terceiro lado:");
        triangulo.setLado3(dado.nextFloat());

        System.out.println(triangulo.verificaTriangulo());
        dado.close();
    }
}
