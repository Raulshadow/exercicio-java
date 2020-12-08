package Questao10;

import java.util.Scanner;

public class AppContaHospital {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("Digite o nome do paciente:");
        paciente.setNome(dado.next());
        System.out.println("Digite  o sexo do paciente:");
        paciente.setSexo(dado.next());
        System.out.println("Digite  o peso do paciente");
        paciente.setPeso(dado.nextFloat());
        System.out.println("Digite  a idade do paciente");
        paciente.setIdade(dado.nextByte());
        System.out.println("Digite  a altura do paciente");
        paciente.setAltura(dado.nextFloat());

        System.out.println("O valor da consulta será de: " + paciente.valorDaConsulta() + "R$");

        dado.close();
    }
}
