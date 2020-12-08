package Questao4;

public class ContaPoupança extends Conta {
    public ContaPoupança(float saldo,float taxaPercentual) {
        super(saldo,taxaPercentual);
    }

    @Override
    public void atualizar() {
        super.setSaldo(saldo * (1f + (taxaPercentual * 3.0f/100.0f)));
    }
}
