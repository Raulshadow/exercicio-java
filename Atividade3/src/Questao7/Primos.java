package Questao7;

public class Primos {
    public void isCousin(int x) {
        boolean cousin = true;
        for (int i = 2; i < x; i++) {
            if (x%i == 0)
                cousin = false;
        }

        if(x <= 1)
            cousin = false;

        if (cousin)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }
}