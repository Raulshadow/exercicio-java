package Questao3;

import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cleiton","Masculino","DCOMP",(float)1000.0);
        Scanner dado = new Scanner(System.in);

        System.out.println("O ganho anual sem a bonificação é de: " + funcionario.ganhoAnual() + " R$");
        System.out.println("Digite o valor da bonificação: ");
        funcionario.bonificar(dado.nextFloat());
        System.out.println("O ganho anual com a bonificação é de: " + funcionario.ganhoAnual() + " R$");

        dado.close();
    }
}
