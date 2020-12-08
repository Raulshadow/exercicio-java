package Questao9;

public class Vetor {
    private int[] vetor;

    private Boolean existe(int x, int[] vet) {
        for (byte i = 0;i < vet.length; i++) {
            if (x == vet[i]) {
                return true;
            }
        }
        return false;
    }

    public int[] unity(int[] vetY) {
        int[] unity = new int[(getVetor().length + vetY.length)];
        byte j = 0;
        for (byte i = 0; i < getVetor().length; i++){
            if (existe(getVetor()[i],unity))
                continue;
            unity[i] = getVetor()[i];
            j++;
        }

        for (byte i = 0; i < vetY.length; i++){
            if (existe(vetY[i],unity))
                continue;
            unity[j] = vetY[i];
            j++;
        }

        int[] aux = new int[j];
        for (byte i = 0; i < j; i++){
            aux[i] = unity[i];
        }
        unity = aux;
        return unity;
    }

    public int[] difference(int[] vetY) {
        int[] difference = new int[getVetor().length];
        byte j = 0;
        for (byte i = 0; i < getVetor().length; i++){
            if (existe(getVetor()[i],vetY))
                continue;
            else if (existe(getVetor()[i],difference))
                continue;
            difference[i] = getVetor()[i];
            j++;
        }

        int[] aux = new int[j];
        for (byte i = 0; i < j; i++){
            aux[i] = difference[i];
        }
        difference = aux;
        return difference;
    }

    public int[] intersection(int[] vetY) {
        int [] intersection = new int[getVetor().length];
        byte j = 0;
        for (byte i = 0; i < getVetor().length; i++){
            if (existe(getVetor()[i],vetY))
                if (!existe(getVetor()[i],intersection)){
                    intersection[j] = getVetor()[i];
                    j++;
                }
        }

        int[] aux = new int[j];
        for (byte i = 0; i < j; i++){
            aux[i] = intersection[i];
        }
        intersection = aux;

        return intersection;
    }

    public Vetor(int[] vetor) {
        this.setVetor(vetor);
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
}
