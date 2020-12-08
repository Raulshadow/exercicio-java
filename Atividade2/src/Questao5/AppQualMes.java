package Questao5;

import java.util.Scanner;

public class AppQualMes {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Calendario mes = new Calendario();

        System.out.println("Digite o nome do mês (Com a primeira letra maiúscula somente): ");
        mes.setMes(dado.next());
        System.out.println("O numero do mês: " + mes.getMes() + " é " + mes.qualMes());

        dado.close();
    }
}
