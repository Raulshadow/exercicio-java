package Questao5;

public class Conta {
    private String nome;
    private int numConta;
    private float saldo;
    private float limite;

    public Conta (String nome, int numConta, float saldo, float limite){
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = ((limite > 940) ? (float) 940 : limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void depositar(float deposito) {
        setSaldo(deposito + getSaldo());
    }

    public void sacar(float saque) {
        if(saque > getLimite()) {
            System.out.println("Não é possível fazer o Saque");
        } else {
            System.out.println("É possível fazer o saque");
            setSaldo(getSaldo() - saque);
            System.out.println("Seu saldo atual "+ getSaldo());
        }
    }
}
