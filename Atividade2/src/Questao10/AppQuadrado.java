package Questao10;

public class AppQuadrado {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();
        Quadrado quadrado3 = new Quadrado();
        MetodosQuadrado metodos = new MetodosQuadrado();

        quadrado1.setLado(39.0);
        quadrado2.setLado(14.0);
        quadrado3.setLado(41.0);

        System.out.println(metodos.compararArea(quadrado1.CalcularArea(),
                quadrado2.CalcularArea(), quadrado3.CalcularArea()));

        System.out.println(metodos.compararPerimetro(quadrado1.CalcularPerimetro(),
                quadrado2.CalcularPerimetro(), quadrado3.CalcularPerimetro()));


    }
}
