package Questao9;

public class AppTempo {
    public static void main(String[] args) {
        Tempo tempo1 = new Tempo();
        Tempo tempo2 = new Tempo();

        tempo1.setHoras((byte) 18);
        tempo1.setMinutos((byte) 30);
        tempo1.setSegundos((byte) 40);

        tempo2.setHoras((byte) 18);
        tempo2.setMinutos((byte) 31);
        tempo2.setSegundos((byte) 50);

        System.out.println("A diferença em segundos é de "
                + tempo1.diferençaDeSegundos(tempo1.segundosTotais(), tempo2.segundosTotais())
                + " Segundos");

    }
}
