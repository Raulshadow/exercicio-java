package Questao1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppMedia {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Arthur",new GregorianCalendar(1997,5,19),10.0f,7.5f,9.5f);
        System.out.println("A média do aluno " + aluno.getNome() + " é de " + aluno.media());
        System.out.println("Data de Nascimento do aluno: " + aluno.getData().get(Calendar.DAY_OF_MONTH) +
                "/"+ aluno.getData().get(Calendar.MONTH) + "/" + aluno.getData().get(Calendar.YEAR));


    }
}
