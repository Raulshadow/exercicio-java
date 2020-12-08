package Questao6;

public class Potencia {
    public void potenciaDe3(){
        byte i = 0;
        short multiplos = 1;
        while (i <= 9) {
            if (i!=0)
                multiplos *= 3;
            System.out.println(multiplos);
            i++;
        }
    }
}
