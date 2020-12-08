package Questao1;

import java.util.Scanner;

public class Numeros {
    private int[] numeros;
    private byte quantosPares;
    private byte quantosImpares;

    public void pegaValores() {
        Scanner dado = new Scanner(System.in);
        setNumeros(new int[10]);

        for (byte i = 0; i < 10; i++){
            System.out.println("Digite o valor numero " + (i+1));
            getNumeros()[i] = dado.nextInt();
        }
        dado.close();
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public byte getQuantosPares() {
        return quantosPares;
    }

    public void setQuantosPares(byte quantosPares) {
        this.quantosPares = quantosPares;
    }

    public byte getQuantosImpares() {
        return quantosImpares;
    }

    public void setQuantosImpares(byte quantosImpares) {
        this.quantosImpares = quantosImpares;
    }

    public void printaPares() {
        setQuantosPares((byte)0);
        for (byte i = 0;i < 10; i++){
            if (getNumeros()[i]%2 == 0) {
                System.out.println(getNumeros()[i]);
                setQuantosPares((byte)(getQuantosPares() + 1));
            }
        }
    }

    public void printaImpares() {
        setQuantosImpares((byte)0);
        for (byte i = 0;i < 10; i++){
            if (getNumeros()[i]%2 != 0) {
                System.out.println(getNumeros()[i]);
                setQuantosImpares((byte)(getQuantosImpares() + 1));
            }
        }
    }
}
