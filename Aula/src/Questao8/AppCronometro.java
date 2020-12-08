package Questao8;

import java.util.Scanner;

public class AppCronometro {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        Relogio horario = new Relogio();

        System.out.println("Digite o valor das horas:");
        horario.setHoras(dado.nextByte());
        System.out.println("Digite os Minutos:");
        horario.setMinutos(dado.nextByte());

        System.out.println("Horas convertidas para minutos: " + horario.horasEmMinutos());
        System.out.println("O total de minutos: " + horario.minutosTotais());
        System.out.println("O total de minutos em segundos: " + horario.segundosTotais());

        dado.close();
    }
}
