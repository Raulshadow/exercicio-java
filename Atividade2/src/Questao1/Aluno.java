package Questao1;

public class Aluno {
    private float nota1;
    private float nota2;
    private float nota3;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float media() {
        return (nota1 + nota2 +nota3)/(float)3.0;
    }

    public String aprovado() {
        if ((0.0 <= media()) && (media() < 3.0)) {
            return "Reprovado";
        } else if ((3.0 <= media()) && (media() < 7.0)) {
            return "Prova final";
        } else if ((7.0 <= media()) && (media() <= 10.0)) {
            return "Aprovado";
        }
        else
            return "Ultrapassou a nota máxima, mais que aprovado.";
    }
}
