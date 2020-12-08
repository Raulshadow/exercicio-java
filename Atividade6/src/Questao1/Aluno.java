package Questao1;

import java.util.Calendar;

public class Aluno extends Pessoa {
    private float nota1;
    private float nota2;
    private float nota3;

    public Aluno (String nome, Calendar data, float nota1, float nota2, float nota3){
        super(nome, data);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
    }

    public float media() {
        return (getNota1() + getNota2() + getNota3())/3.0f;
    }

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
}
