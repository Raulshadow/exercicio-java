package Questao2;

public class AppTipo {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Object[] data = {"Lista5", new Pessoa(), i};
        for (byte j = 0; j < data.length; j++) {
            if (data[j]  instanceof String )
                System.out.println("O tipo de objeto na posição " + j + " é String");
            if (data[j]  instanceof Pessoa )
                System.out.println("O tipo de objeto na posição " + j + " é Pessoa");
            if (data[j]  instanceof Integer )
                System.out.println("O tipo de objeto na posição " + j + " é Intenger");
        }
    }
}
