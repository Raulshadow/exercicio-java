package Questao9;

public class AppVetores {
    public static void printaVetores(int[] x) {
        for (byte i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Vetor vetorX = new Vetor(new int[]{1,2,3,4,5,6,7,8,9,10});
        Vetor vetorY = new Vetor(new int[]{6,7,8,9,10,11,12,13,14,15});

        System.out.println("União de X e Y:");
        printaVetores(vetorX.unity(vetorY.getVetor()));
        System.out.println("Diferença de X e Y:");
        printaVetores(vetorX.difference(vetorY.getVetor()));
        System.out.println("Interseção de X e y:");
        printaVetores(vetorX.intersection(vetorY.getVetor()));
    }
}
