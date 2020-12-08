package Questao2;

public class AppMaiorMenor {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.pegaValoresMaiorMenor();

        System.out.println("O maior número é " + numeros.getMaior() + " e o menor é " + numeros.getMenor());
    }
}
