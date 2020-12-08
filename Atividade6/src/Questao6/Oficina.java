package Questao6;

import java.util.Random;

public class Oficina {
    public Veiculo proximo() {
        Random r = new Random();
        int valor = r.nextInt();

        if ((valor % 2) == 0)
            return new Bicicleta();
        else
            return new Automovel();
    }

    public void manutencao(Veiculo v) {
        if(v instanceof Automovel ){
            ((Automovel) v).listarVerificacoes();
            ((Automovel) v).ajustar();
            ((Automovel) v).limpar();
            ((Automovel) v).mudarOleo();
            System.out.println();
        } else {
            ((Bicicleta) v).listarVerificacoes();
            ((Bicicleta) v).ajustar();
            ((Bicicleta) v).limpar();
            System.out.println();
        }
    }
}
