package Questao1;

public class Circulo extends Figura {
    private float raio;

    public Circulo() {
        this.raio = 5f;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * (raio * raio));
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
