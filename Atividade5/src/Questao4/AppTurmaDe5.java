package Questao4;

public class AppTurmaDe5 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("aluno1",2.5f);
        Aluno aluno2 = new Aluno("aluno2",3.8f);
        Aluno aluno3 = new Aluno("aluno3",5.9f);
        Aluno aluno4 = new Aluno("aluno4",8.0f);
        Aluno aluno5 = new Aluno("aluno5",1.5f);

        Turma turma = new Turma(new String[5],new float[5]);

        turma.getNomes()[0] = aluno1.getNome();
        turma.getNomes()[1] = aluno2.getNome();
        turma.getNomes()[2] = aluno3.getNome();
        turma.getNomes()[3] = aluno4.getNome();
        turma.getNomes()[4] = aluno5.getNome();

        turma.getMedias()[0] = aluno1.getMedia();
        turma.getMedias()[1] = aluno2.getMedia();
        turma.getMedias()[2] = aluno3.getMedia();
        turma.getMedias()[3] = aluno4.getMedia();
        turma.getMedias()[4] = aluno5.getMedia();

        System.out.println("O aluno com maior média foi o " + turma.getNomes()[turma.indiceMaiorMedia()]);
        turma.reprovados();

    }
}
