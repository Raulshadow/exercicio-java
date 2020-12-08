package Questao5;

public class Turma {
    private Aluno[] alunos;

    public Turma (Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno maiorMedia() {
        Aluno mediaMaior = getAlunos()[0];
        int i = 1;
        while(i < alunos.length){
            if (getAlunos()[i].getMedia() > mediaMaior.getMedia())
                mediaMaior = getAlunos()[i];
            i++;
        }
        return mediaMaior;
    }

    public void reprovados() {
        for (int i = 0; i < alunos.length; i++){
            if(getAlunos()[i].getMedia() < 5)
                System.out.println(getAlunos()[i].getNome() + " Está reprovado!");
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
