package Questao7;

public class Emprestimo {
    private float salarioBruto;
    private float desconto;
    private float valorDeEmprestimo;


    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorDeEmprestimo() {
        return valorDeEmprestimo;
    }

    public void setValorDeEmprestimo(float valorDeEmprestimo) {
        this.valorDeEmprestimo = valorDeEmprestimo;
    }

    public String emprestimo(){
        float salarioLiquido = salarioBruto - desconto;
        if (valorDeEmprestimo > (salarioLiquido * 0.3))
            return "Não é possível fazer o empréstimo";
        else
            return "É possível fazer o empréstimo";
    }
}
