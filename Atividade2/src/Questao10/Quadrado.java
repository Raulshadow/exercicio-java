package Questao10;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double CalcularArea() {
        return lado * lado;
    }
    public double CalcularPerimetro() {
        return lado * 4;
    }
}
