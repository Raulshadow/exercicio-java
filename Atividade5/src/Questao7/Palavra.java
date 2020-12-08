package Questao7;

public class Palavra {
    private char[] palavra;

    public Palavra(char[] palavra) {
        this.setPalavra(palavra);
    }

    public void isPalindromo() {
        Boolean pali = true;
        for(int i = 0; i < getPalavra().length; i++){
            if (getPalavra()[i] != getPalavra()[(getPalavra().length - 1)-i])
                pali = false;
        }
        if (pali)
            System.out.println("É palíndromo!");
        else
            System.out.println("Não é palíndromo!");
    }

    public char[] getPalavra() {
        return palavra;
    }

    public void setPalavra(char[] palavra) {
        this.palavra = palavra;
    }
}
