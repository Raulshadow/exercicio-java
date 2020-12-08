package Questao9;

import java.util.Scanner;

public class Tabuada {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void digitaPositivo() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Esta ação se repetirá até o valor digitado seja positivo.");
        do {
            System.out.println("Digite o valor numero:");
            setNumero(dado.nextInt());
        } while (numero < 0);
    }

    public void tabuadaSoma() {
        for (byte i = 1; i<=10 ; i++){
                System.out.println(numero + " + " + i + " = " + (numero + i));
        }
    }
}
