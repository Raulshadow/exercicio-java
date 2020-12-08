package Questao8;

public class Funcionario {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentoAnual() {
        float taxaAnual = (float)0.015;
        System.out.println("O salário no ano: 2005 foi de " + getSalario());
        for(byte i = 0; i < 11 ; i++){
            setSalario(salario * (1 + taxaAnual));
            taxaAnual *= 2;
            int ano = 2006 + i;
            System.out.println("O salário no ano: " + ano + " foi de " + getSalario());
        }
    }
}
