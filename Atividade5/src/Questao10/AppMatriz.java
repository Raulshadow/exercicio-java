package Questao10;

import java.util.Scanner;

public class AppMatriz {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Matriz matriz = new Matriz(5,8);

        for (byte i = 0; i < 5 ; i++){
            for(byte j = 0; j < 8; j++){
                System.out.println("Digite um valor: ");
                matriz.getMatriz()[i][j] = dado.nextInt();
            }
        }

        boolean repete = true;
        while (repete) {
            System.out.println("Deseja fazer uma consulta? (digite true ou false)");
            if(!dado.nextBoolean()){
                repete = false;
                continue;
            }
            System.out.println("Digite o valor desejado: ");
            System.out.println(matriz.consulta(dado.nextInt()));
        }
    }
}
