package Questao5;

public class AppIMC {
    public static void main(String[] args) {
        Homem jose = new Homem("José", "08/01/1930",60,1.7);
        Mulher maria = new Mulher("Maria", "07/05/1923",70,1.5);
        PessoaIMC[] vetP = new PessoaIMC[5];
        vetP[0] = maria;
        vetP[1] = jose;
        vetP[2] = new PessoaIMC("Lucas","04/12/2003",66,1.6);
        vetP[3] = new PessoaIMC("Gabriela","05/07/1990",72,1.7);
        vetP[4] = new PessoaIMC("Bruno","21/12/2000",85,1.9);

        for (byte i = 0; i < 5; i++) {
            System.out.println(vetP[i].toString() + vetP[i].resultIMC());
        }
    }
}
