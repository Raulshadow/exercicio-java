package Questao9;

public class Conta {
    private float salarioMinimo;
    private float quantidadeDeKw;

    public float getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(float salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public float getQuantidadeDeKw() {
        return quantidadeDeKw;
    }

    public void setQuantidadeDeKw(float quantidadeDeKw) {
        this.quantidadeDeKw = quantidadeDeKw;
    }

    public float valorDeKw() {
        return getSalarioMinimo() /(float)5.0;
    }

    public float valorDaConta() {
        return getQuantidadeDeKw() * valorDeKw();
    }

    public float contaComDesconto() {
        return valorDaConta() * (float)0.85;
    }
}
