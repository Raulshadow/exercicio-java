package Questao8;

public class Numeros {
    private int[] numeros;

    public Numeros (int[] numeros) {
        this.numeros = numeros;
    }

    private Boolean isCousin(int x) {
        boolean cousin = true;
        for (int i = 2; i < x; i++) {
            if (x%i == 0)
                cousin = false;
        }
        if (x <= 1)
            cousin = false;

        return cousin;
    }

    public void printaPrimos() {
        for(int i = 0; i < getNumeros().length; i++){
            if (isCousin(getNumeros()[i]))
                System.out.println(getNumeros()[i] + " na posição " + i);
        }
    }

    public int[] getNumeros() {
        return numeros;
    }
}
