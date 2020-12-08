package Questao7;

import java.util.Scanner;

public class AppIncrease {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Employee employee = new Employee();
        employee.setIncrease((float) 1.25);

        System.out.println("Digite o valor do empregado:");
        employee.setSalary(dado.nextFloat());
        System.out.println("O salário sem aumento: " + employee.getSalary() + "R$");
        System.out.println("O salário terá um aumento de: " + employee.increaseValue() + "R$");
        System.out.println("O novo salário tem valor de: " + employee.newSalary() + "R$");

        dado.close();
    }
}
