package Questao3;

public class ObjetoCeleste {
    private float convertingRate;

    public float getConvertingRate() {
        return convertingRate;
    }

    public void setConvertingRate(float convertingRate) {
        this.convertingRate = convertingRate;
    }
    public float convertion(float massa){
        return (massa * convertingRate);
    }
}
