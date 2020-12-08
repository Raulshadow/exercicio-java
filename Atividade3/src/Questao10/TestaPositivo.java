package Questao10;

import java.util.Scanner;

public class TestaPositivo {
    public void detalhesDosValores(Numero num1, Numero num2, Numero num3, Numero num4, Numero num5,
                                    Numero num6, Numero num7, Numero num8, Numero num9, Numero num10){
        Scanner dado = new Scanner(System.in);
        int somaTotal = 0;
        int maior = 0;
        byte i = 1;
        while (i <= 10) {
            switch (i) {
                case 1:
                    System.out.println("Digite o valor 1º valor:");
                    num1.setNumero(dado.nextInt());
                    if (num1.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        maior = num1.getNumero();
                        somaTotal += num1.getNumero();
                        i++;
                    }
                    continue;
                case 2:
                    System.out.println("Digite o valor 2º valor:");
                    num2.setNumero(dado.nextInt());
                    if(num2.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num2.getNumero())
                            maior = num2.getNumero();
                        somaTotal += num2.getNumero();
                        i++;
                    }
                    continue;
                case 3:
                    System.out.println("Digite o valor 3º valor:");
                    num3.setNumero(dado.nextInt());
                    if (num3.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num3.getNumero())
                            maior = num3.getNumero();
                        somaTotal += num3.getNumero();
                        i++;
                    }
                    continue;
                case 4:
                    System.out.println("Digite o valor 4º valor:");
                    num4.setNumero(dado.nextInt());
                    if (num4.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num4.getNumero())
                            maior = num4.getNumero();
                        somaTotal += num4.getNumero();
                        i++;
                    }
                    continue;
                case 5:
                    System.out.println("Digite o valor 5º valor:");
                    num5.setNumero(dado.nextInt());
                    if (num5.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num5.getNumero())
                            maior = num5.getNumero();
                        somaTotal += num5.getNumero();
                        i++;
                    }
                    continue;
                case 6:
                    System.out.println("Digite o valor 6º valor:");
                    num6.setNumero(dado.nextInt());
                    if (num6.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num6.getNumero())
                            maior = num6.getNumero();
                        somaTotal += num6.getNumero();
                        i++;
                    }
                    continue;
                case 7:
                    System.out.println("Digite o valor 7º valor:");
                    num7.setNumero(dado.nextInt());
                    if (num7.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num7.getNumero())
                            maior = num7.getNumero();
                        somaTotal += num7.getNumero();
                        i++;
                    }
                    continue;
                case 8:
                    System.out.println("Digite o valor 8º valor:");
                    num8.setNumero(dado.nextInt());
                    if (num8.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num8.getNumero())
                            maior = num8.getNumero();
                        somaTotal += num8.getNumero();
                        i++;
                    }
                    continue;
                case 9:
                    System.out.println("Digite o valor 9º valor:");
                    num9.setNumero(dado.nextInt());
                    if(num9.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num9.getNumero())
                            maior = num9.getNumero();
                        somaTotal += num9.getNumero();
                        i++;
                    }
                    continue;
                case 10:
                    System.out.println("Digite o valor 10º valor:");
                    num10.setNumero(dado.nextInt());
                    if(num10.getNumero() < 0) {
                        System.out.println("ERRO Valor não aceito");
                    } else {
                        if (maior < num10.getNumero())
                            maior = num10.getNumero();
                        somaTotal += num10.getNumero();
                        i++;
                    }
                    continue;
                default:
                    break;
            }
        }
        System.out.println("O maior valor é " + maior);
        System.out.println("A soma total vale " + somaTotal);
        System.out.println("A média vale " + (somaTotal/10.0));
    }
}
