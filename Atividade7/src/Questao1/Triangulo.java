package Questao1;

public class Triangulo extends Figura {
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo() {
        this.lado1 = 9f;
        this.lado2 = 7f;
        this.lado3 = 14f;
    }

    public float calcularArea() {
        float semiPer = (lado1 + lado2 + lado3)/2;
        return  (float) Math.sqrt(semiPer * (semiPer - lado1) * (semiPer - lado2) * (semiPer - lado3));
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
}
