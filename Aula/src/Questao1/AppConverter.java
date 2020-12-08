package Questao1;

import java.util.Scanner;

public class AppConverter {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Galao galao = new Galao();

        System.out.println(("Digite a quantidade de galões para converter em litros:"));
        System.out.println(galao.galaoParaLitros(dado.nextFloat()) + " Litros.");

        dado.close();
    }
}
