package Questao1;

public class Galao {
    private static final float capacidade = (float) 3.7854;

    public float getCapacidade() {
        return capacidade;
    }

    public float galaoParaLitros(float x) {
        return x * capacidade;
    }
}
