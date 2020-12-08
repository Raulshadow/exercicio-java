package Questao5;

public class AppConta {
    public static void main(String[] args) {
        Conta proprietario1 = new Conta("Josefina",934, (float)5000,(float)940);
        //digitar maior q o limite define o máximo estimado pela questão

        System.out.println("Olá " + proprietario1.getNome() + ". Seu saldo é de " + proprietario1.getSaldo());
        proprietario1.depositar((float)100);
        proprietario1.sacar((float)700);
    }
}
