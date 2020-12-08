package Questao5;

public class Mulher extends PessoaIMC {
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome,dataNascimento,peso,altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getAltura(),getPeso());
        if (imc < 19)
            return ("Com o IMC: "+ imc + " o peso é abaixo do Ideal" + "\n");
        else if ((19 <= imc) && (imc < 25.8))
            return ("Com o IMC: "+ imc + " o peso é ideal" + "\n");
        else
            return ("Com o IMC: "+ imc + " o peso é acima do ideal" + "\n");
    }
}
