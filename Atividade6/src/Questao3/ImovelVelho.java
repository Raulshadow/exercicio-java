package Questao3;

public class ImovelVelho extends Imovel {
    @Override
    public void setPrice(float price) {
        super.setPrice(price * 0.7f);
    }

    public float desconto() {
        return (getPrice() * 0.3f)/0.7f;
    }

    public void printDesconto(){
        System.out.println("O desconto foi de " + desconto());
    }
}
