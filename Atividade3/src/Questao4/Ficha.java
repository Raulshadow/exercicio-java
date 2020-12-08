package Questao4;

public class Ficha {
    public void fichaJogadores(Jogadores a, Jogadores b, Jogadores c, Jogadores d, Jogadores e) {
        byte menores18 = 0;
        float pesoMaior80 = 0;
        int idadeTotal = 0;
        for (int i = 1; i<=5 ;i++) {
            switch (i) {
                case 1:
                    if (a.getPeso() > 80.0) pesoMaior80 += 1;
                    if (a.getIdade() < 18) menores18 += 1;
                    idadeTotal += a.getIdade();
                    continue;
                case 2:
                    if (b.getPeso() > 80.0) pesoMaior80 += 1;
                    if (b.getIdade() < 18) menores18 += 1;
                    idadeTotal += b.getIdade();
                    continue;
                case 3:
                    if (c.getPeso() > 80.0) pesoMaior80 += 1;
                    if (c.getIdade() < 18) menores18 += 1;
                    idadeTotal += c.getIdade();
                    continue;
                case 4:
                    if (d.getPeso() > 80.0) pesoMaior80 += 1;
                    if (d.getIdade() < 18) menores18 += 1;
                    idadeTotal += d.getIdade();
                    continue;
                case 5:
                    if (e.getPeso() > 80.0) pesoMaior80 += 1;
                    if (e.getIdade() < 18) menores18 += 1;
                    idadeTotal += e.getIdade();
                    continue;
                default:
                    break;
            }
        }

        System.out.println("Existem " + menores18 + " menores que 18 anos.");
        System.out.println("A média de idade entre os 5 é de " + (idadeTotal/5.0) + " anos.");
        System.out.println(((pesoMaior80/5.0)*100) + "% tem peso maiores que 80KG");
    }
}
