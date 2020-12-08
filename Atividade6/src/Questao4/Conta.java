package Questao4;

public class Conta {
    protected float saldo;
    protected float taxaPercentual;

    public Conta() {}

    public Conta(float saldo,float taxaPercentual) {
        setTaxaPercentual(taxaPercentual);
        setSaldo(saldo);
    }

    public void depositar(float x) {
        setSaldo(saldo + x);
    }

    public void sacar(float x) {
        setSaldo(saldo - x);
    }

    public void atualizar() {
        setSaldo(saldo * (1f + (taxaPercentual/100.0f)));
    }

    public float verificaSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTaxaPercentual() {
        return taxaPercentual;
    }

    public void setTaxaPercentual(float taxaPercentual) {
        this.taxaPercentual = taxaPercentual;
    }
}
