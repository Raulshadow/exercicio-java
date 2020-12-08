package Questao6;

public class Salario {
    private float salarioMinimo;
    private float salarioRecebido;

    public float getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(float salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public float getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(float salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    public float mediaSalarial(){
        return getSalarioRecebido() / getSalarioMinimo();
    }
}
