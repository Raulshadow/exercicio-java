package Questao9;

public class Tempo {
    //considerei que seria o padrão relógio (horas até 23, minutos até 59 e segundos até 59)
    private byte horas;
    private byte minutos;
    private byte segundos;

    public byte getHoras() {
        return horas;
    }

    public void setHoras(byte horas) {
        this.horas = horas;
    }

    public short getMinutos() {
        return minutos;
    }

    public void setMinutos(byte minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(byte segundos) {
        this.segundos = segundos;
    }

    public int segundosTotais() {
        return (int) ((horas * 3600) + (minutos * 60) + segundos);
    }

    //ia usar o Math.abs mas como a lista é de condicional
    public int diferençaDeSegundos(int x, int y) {
        if (x > y)
            return x-y;
        else
            return y-x;
    }
}
