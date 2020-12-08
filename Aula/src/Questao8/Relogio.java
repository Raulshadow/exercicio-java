package Questao8;

public class Relogio {
    private byte horas;
    private byte minutos;

    public byte getHoras() {
        return horas;
    }

    public void setHoras(byte horas) {
        this.horas = horas;
    }

    public byte getMinutos() {
        return minutos;
    }

    public void setMinutos(byte minutos) {
        this.minutos = minutos;
    }

    public short horasEmMinutos() {
        return (short)(getHoras() * 60);
    }

    public short minutosTotais() {
        return (short)(horasEmMinutos() + getMinutos());
    }

    public int segundosTotais() {
        return (int)(minutosTotais() * 60);
    }
}
