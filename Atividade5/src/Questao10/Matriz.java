package Questao10;

public class Matriz {
    private int[][] matriz;

    public String consulta(int x) {
        for (byte i = 0;i < getMatriz().length; i++) {
            for (byte j = 0; j < getMatriz()[i].length; j++)
                if (x == getMatriz()[i][j]) {
                    return ("O valor " + getMatriz()[i][j] + " na linha "+ (i+1) + " e na coluna " + (j+1));
                }
        }
        return "Não foi encontrado";

    }

    public Matriz(int linha, int coluna) {
        setMatriz(new int[linha][coluna]);
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
