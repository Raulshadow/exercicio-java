package Questao5;

public class Circulo {
    private static final float pi = (float)3.14;
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float area() {
        return pi * (raio * raio);
    }
}
