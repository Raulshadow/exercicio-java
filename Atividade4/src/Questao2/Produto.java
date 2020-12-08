package Questao2;

public class Produto {
    private int codigo;
    private String nome;
    private short quantidade;
    private float price;

    public Produto(int codigo, String nome, short quantidade, float price) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPrice(price);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
