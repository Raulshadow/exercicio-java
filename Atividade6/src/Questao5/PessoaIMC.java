package Questao5;

public class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC() {}

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC(double altura, double peso) {
        return peso/Math.pow(altura,2);
    }

    public String resultIMC() {
        return ("O IMC é de: " + calculaIMC(altura,peso) + "\n");
    }

    @Override
    public String toString() {
        return ("Nome: " + getNome() + "\n" +
                "Data de Nascimento: " + getDataNascimento() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Altura: " + getAltura() + "\n");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
