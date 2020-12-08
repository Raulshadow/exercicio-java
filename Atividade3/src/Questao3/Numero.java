package Questao3;

import java.util.Scanner;

public class Numero {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void digitaPositivo() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Esta ação se repetirá até o valor digitado ser positivo.");

        do {
            System.out.println("Digite o valor do número:");
            setNumero(dado.nextInt());
        } while (getNumero() <= 0);
    }

    public float valorE(){
        float e = 0;
        for (float i = 1; i<=numero ; i++){
            e += 1/i;
        }
        return e;
    }
}
