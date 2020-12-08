package Questao1;

public class Quadrado extends Figura {
    private float lado;

    public Quadrado() {
        this.setLado(2f);
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
