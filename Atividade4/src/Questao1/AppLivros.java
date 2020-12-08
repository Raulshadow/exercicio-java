package Questao1;

public class AppLivros {
    public static void main(String[] args){
        Livro livro1 = new Livro((int)2828,"Filosofia",(short)270);
        Livro livro2 = new Livro((int)1247,"Sociologia",(short)460);
        Livro livro3 = new Livro((int)3598,"Java",(short)20);
        System.out.println("Código: " +livro1.getCodigo() + " | Nome: " + livro1.getNome() + " | Exemplares: " + livro1.getQtdExemplares());
        System.out.println("Código: " +livro2.getCodigo() + " | Nome: " + livro2.getNome() + " | Exemplares: " + livro2.getQtdExemplares());
        System.out.println("Código: " +livro3.getCodigo() + " | Nome: " + livro3.getNome() + " | Exemplares: " + livro3.getQtdExemplares());

        livro1.setQtdExemplares((short)350);
        livro2.setQtdExemplares((short)700);
        livro3.setQtdExemplares((short)100);

        System.out.println("Código: " +livro1.getCodigo() + " | Nome: " + livro1.getNome() + " | Exemplares: " + livro1.getQtdExemplares());
        System.out.println("Código: " +livro2.getCodigo() + " | Nome: " + livro2.getNome() + " | Exemplares: " + livro2.getQtdExemplares());
        System.out.println("Código: " +livro3.getCodigo() + " | Nome: " + livro3.getNome() + " | Exemplares: " + livro3.getQtdExemplares());
    }
}
