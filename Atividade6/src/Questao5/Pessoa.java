package Questao5;

public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa() {}
    
    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return ("Nome: " + getNome() + "\n" +
                "Data de Nascimento: " + getDataNascimento() + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
