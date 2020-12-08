package Questao5;

public class Homem extends PessoaIMC {
    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome,dataNascimento,peso,altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getAltura(),getPeso());
        if (imc < 20.7)
            return ("Com o IMC: "+ imc + " o peso é abaixo do Ideal" + "\n");
        else if ((20.7 <= imc) && (imc < 26.4))
            return ("Com o IMC: "+ imc + " o peso é ideal" + "\n");
        else
            return ("Com o IMC: "+ imc + " o peso é acima do ideal" + "\n");
    }
}
