package Questao1;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private Calendar data;

    public Pessoa() {}

    public Pessoa(String nome, Calendar data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
