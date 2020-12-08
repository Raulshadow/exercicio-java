package Questao4;

public class ContaCorrente extends Conta {

    public ContaCorrente(float saldo,float taxaPercentual) {
        super(saldo,taxaPercentual);
    }
    @Override
    public void atualizar() {
        super.setSaldo(saldo * (1f + (taxaPercentual * 2f/100.0f)));
    }

    @Override
    public void depositar(float x) {
        super.setSaldo((saldo + x) - 0.1f);
    }
}
