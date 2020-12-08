package Questao4;

import java.util.Scanner;

public class Produto {
    private String nome;
    private float precoCusto;
    private float precoVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        Scanner dado = new Scanner(System.in);
        if (precoVenda < precoCusto) {
            System.out.println("O preço digitado é inferior ao custo do produto, por favor redigite");
            setPrecoVenda(dado.nextFloat());
        } else
            this.precoVenda = precoVenda;
    }

    public float getMargemLucro() {
        return getPrecoVenda() - getPrecoCusto();
    }

    public float getMargemLucroPorcentagem() {
        return (getMargemLucro() * (float)100/getPrecoCusto());
    }

}
