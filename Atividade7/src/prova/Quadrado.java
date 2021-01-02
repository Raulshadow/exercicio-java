package prova;

public class Quadrado {
    private int lado;

    public Quadrado() {}

    public Quadrado(int lado) {
        this.setLado(lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return getLado() * getLado();
    }

    public int calcularPerimetro() {
        return getLado() * 4;
    }
}
