package Questao1;

import java.util.Scanner;

public class Numeros {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void digitaPositivo() {
        Scanner dado = new Scanner(System.in);

        do {
            System.out.println("Esta ação se repetirá até ambos valores digitados sejam positivos.");
            System.out.println("Digite o valor num1:");
            setNum1(dado.nextInt());
            System.out.println("Digite o valor num2:");
            setNum2(dado.nextInt());
        } while (num1 < 0 || num2 < 0);
    }

    public int somaTotal(){
        int aux = 0;
        for (int i = 1; i < (num2 - num1);i++) {
            aux += num1 + i;
        }
        return aux;
    }

    public int organiza() {
        if (num1 <= num2)
            return somaTotal();
        else {
            int aux = num1;
            setNum1(num2);
            setNum2(aux);
            aux = 0;
            while (num1 < num2-1) {
                aux += ++num1;
            }
            return aux;
        }

    }
}
