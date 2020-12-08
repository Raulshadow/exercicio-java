package Questao10;

public class MetodosQuadrado {
    public String compararArea(double x, double y, double z) {
        if ((x > y) && (x > z))
            return ("A maior área é " + x);
        else if ((y > x) && (y > z))
            return ("A maior área é " + y);
        else
            return ("A maior área é " + z);
    }

    public String compararPerimetro(double x, double y, double z) {
        if ((x > y) && (x > z))
            return ("O maior perímetro é " + x);
        else if ((y > x) && (y > z))
            return ("O maior perímetro é " + y);
        else
            return ("O maior perímetro é " + z);
    }
}
