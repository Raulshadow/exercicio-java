package Questao2;

public class Item {
    private int codigo;
    private Produto produto;
    private short quantidadeVendida;

    public Item(int codigo, Produto produto, short quantidadeVendida) {
        this.setCodigo(codigo);
        this.setProduto(produto);
        this.setQuantidadeVendida(quantidadeVendida);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(short quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
