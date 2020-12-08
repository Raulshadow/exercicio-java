package Questao2;

public class Nadador {
    private byte idade;

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String categoria() {
        if ((0 <= idade) && (idade <= 10))
            return "Intantil";
        else if ((10 < idade) && (idade <= 15))
            return "Jovem";
        else if ((15 < idade) && (idade <= 30))
            return "Adolescente";
        else if ((30 < idade) && (idade <= 45))
            return "Adulto";
        else
            return "Sênior";
    }
}
