package Questao4;

public class Turma {
    private String[] nomes;
    private float[] medias;

    public Turma(String[] nomes, float[] medias) {
        this.setNomes(nomes);
        this.setMedias(medias);
    }

    public int indiceMaiorMedia() {
        float mediaMaior = getMedias()[0];
        int indice = 0;
        int i = 1;
        while(i < getMedias().length){
            if (getMedias()[i] > mediaMaior) {
                mediaMaior = getMedias()[i];
                indice = i;
            }
            i++;
        }
        return indice;
    }

    public void reprovados() {
        for (int i = 0; i < medias.length; i++){
            if(getMedias()[i] < 5)
                System.out.println(getNomes()[i] + " Está reprovado!");
        }
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public float[] getMedias() {
        return medias;
    }

    public void setMedias(float[] medias) {
        this.medias = medias;
    }
}
