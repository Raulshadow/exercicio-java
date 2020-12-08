package Questao6;

public class Data {
    private int[] data;

    public Data (int[] data) {
        this.setData(data);
    }

    public int[] juntaData(int[] x, int[] y) {
        int[] data3 = new int[(x.length + y.length)];
        for (int i = 0; i < x.length ; i++){
            data3[i] = x[i];
        }
        for (int j = 0; j < y.length ; j++){
            data3[j+x.length] = y[j];
        }
        return data3;
    }

    public void printaData() {
        for (int i = 0; i < getData().length; i++) {
            System.out.print(getData()[i] + "\t");
        }
        System.out.println();
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
