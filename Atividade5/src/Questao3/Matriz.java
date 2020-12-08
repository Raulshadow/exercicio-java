package Questao3;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int[][] matrizR;
    private int maior;

    public void pegaValores() {
        Scanner dado = new Scanner(System.in);
        setMatriz(new int[4][4]);

        for (byte i = 0; i < 4; i++){
            for (byte j = 0; j < 4; j++){
                System.out.println("Digite um valor numero");
                getMatriz()[i][j] = dado.nextInt();
            }
        }
        dado.close();
    }

    public void pegaMaior() {
        setMaior(getMatriz()[0][0]);
        for (byte i = 0; i < 4; i++){
            for (byte j = 0; j < 4; j++){
                if (getMatriz()[i][j] > getMaior())
                    setMaior(getMatriz()[i][j]);
            }
        }
    }

    public void multiplicaMatriz() {
        setMatrizR(new int[4][4]);
        for (byte i = 0; i < 4; i++){
            for (byte j = 0; j < 4; j++){
                getMatrizR()[i][j] = getMaior() * getMatriz()[i][j];
                System.out.print(getMatrizR()[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int[][] getMatrizR() {
        return matrizR;
    }

    public void setMatrizR(int[][] matrizR) {
        this.matrizR = matrizR;
    }
}
