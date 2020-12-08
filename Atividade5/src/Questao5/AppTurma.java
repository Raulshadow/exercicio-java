package Questao5;

public class AppTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma(new Aluno[5]);
        turma1.getAlunos()[0]= new Aluno("aluno1", 3.5f);
        turma1.getAlunos()[1]= new Aluno("aluno2", 7.0f);
        turma1.getAlunos()[2]= new Aluno("aluno3", 2.5f);
        turma1.getAlunos()[3]= new Aluno("aluno4", 4.9f);
        turma1.getAlunos()[4]= new Aluno("aluno5", 6.0f);

        System.out.println("O aluno de maior média é o " + turma1.maiorMedia().getNome());
        turma1.reprovados();
    }
}
