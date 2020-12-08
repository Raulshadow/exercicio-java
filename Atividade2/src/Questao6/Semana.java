package Questao6;

public class Semana {
    private byte dia;

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public String diaDaSemana() {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
            default:
                return "Não é um dia da semana";
        }
    }
}
