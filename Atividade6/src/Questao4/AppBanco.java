package Questao4;

public class AppBanco {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000f,10f);
        ContaPoupança conta2 = new ContaPoupança(1000f,10f);

        //atualizar os dados
        conta1.atualizar();
        conta2.atualizar();

        //deposito e saque
        conta1.depositar(1000f);
        conta1.sacar(300f);
        conta2.depositar(1000f);
        conta2.sacar(300f);

        //exibir saldo atual
        System.out.println("Saldo conta 1: " + conta1.verificaSaldo());
        System.out.println("Saldo conta 2: " + conta2.verificaSaldo());
    }
}
