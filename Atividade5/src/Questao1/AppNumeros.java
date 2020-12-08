package Questao1;

public class AppNumeros {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.pegaValores();

        System.out.println("Os números pares:");
        numeros.printaPares();
        System.out.println("Os números ímpares:");
        numeros.printaImpares();

        System.out.println("Existe " + numeros.getQuantosPares() + " números pares e existe " +
                numeros.getQuantosImpares() + " ímpares.");
    }
}
