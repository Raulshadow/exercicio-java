package Questao6;

public class AppData {
    public static void main(String[] args) {
        Data data1 = new Data(new int[]{1,3,5,3,56,9});
        data1.printaData();
        Data data2 = new Data(new int[]{7,1,44,90,5,8});
        data2.printaData();
        Data data3 = new Data(data1.juntaData(data1.getData(),data2.getData()));
        data3.printaData();
    }
}
