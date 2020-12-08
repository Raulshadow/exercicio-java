package Questao3;

public class ImovelNovo extends Imovel {

    @Override
    public void setPrice(float price) {
        super.setPrice(price * 1.1f);
    }

    public float valoriza() {
        return (getPrice() * 0.1f)/1.1f;
    }

    public void printValoriza(){
        System.out.println("A valorização foi de " + valoriza());
    }

}
