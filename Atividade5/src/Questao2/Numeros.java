package Questao2;

import java.util.Scanner;

public class Numeros {
    private int[] numeros;
    private int maior;
    private int menor;

    public void pegaValoresMaiorMenor() {
        Scanner dado = new Scanner(System.in);
        setNumeros(new int[10]);

        for (byte i = 0; i < 10; i++){
            System.out.println("Digite o valor numero " + (i+1));
            getNumeros()[i] = dado.nextInt();

            switch (i) {
                case 0:
                    setMaior(getNumeros()[i]);
                    setMenor(getNumeros()[i]);
                default:
                    if (getNumeros()[i] > getMaior())
                        setMaior(getNumeros()[i]);
                    if (getNumeros()[i] < getMenor())
                        setMenor(getNumeros()[i]);
            }
        }
        dado.close();
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
}
