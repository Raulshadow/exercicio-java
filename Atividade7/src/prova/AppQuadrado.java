package prova;

public class AppQuadrado {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado();
        quadrado2.setLado(10);
        Quadrado quadrado3 = new Quadrado(5);

        if (quadrado1.calcularArea() >= quadrado2.calcularArea()
                && quadrado1.calcularArea() >= quadrado3.calcularArea()){
            System.out.println("O quadrado de lado: " + quadrado1.getLado() + " tem área de " + quadrado1.calcularArea());
        } else if (quadrado2.calcularArea() >= quadrado1.calcularArea()
                && quadrado2.calcularArea() >= quadrado3.calcularArea()){
            System.out.println("O quadrado de lado: " + quadrado2.getLado() + " tem área de " + quadrado2.calcularArea());
        } else
            System.out.println("O quadrado de lado: " + quadrado3.getLado() + " tem área de " + quadrado3.calcularArea());

        if (quadrado1.calcularPerimetro() <= quadrado2.calcularPerimetro()
                && quadrado1.calcularPerimetro() <= quadrado3.calcularPerimetro()){
            System.out.println("O quadrado de lado: " + quadrado1.getLado() + " tem perimetro de " + quadrado1.calcularPerimetro());
        } else if (quadrado2.calcularPerimetro() <= quadrado1.calcularPerimetro()
                && quadrado2.calcularPerimetro() <= quadrado3.calcularPerimetro()){
            System.out.println("O quadrado de lado: " + quadrado2.getLado() + " tem perimetro de " + quadrado2.calcularPerimetro());
        } else
            System.out.println("O quadrado de lado: " + quadrado3.getLado() + " tem perimetro de " + quadrado3.calcularPerimetro());
    }
}
