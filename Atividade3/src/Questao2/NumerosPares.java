package Questao2;

public class NumerosPares {
    public void printaParesFor(){
        System.out.println("Usando for: ");
        for (byte i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }


    public void printaParesWhile() {
        //utilizei vetores apenas por não ter noção de como colocar mais um loop.
        System.out.println("Usando While: ");
        byte a = 1;
        while (a <= 100) {
            if (a%2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }


    public void printaParesDoWhile() {
        System.out.println("Usando do While: ");
        int i = 1;
        do {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i<=100);
    }
}
