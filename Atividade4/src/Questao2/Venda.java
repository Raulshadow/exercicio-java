package Questao2;

public class Venda {
    public static void main(String[] args) {
        Produto cartola = new Produto(333, "Cartola",(short)50, (float)21.90);
        Produto touca = new Produto(444, "Touca",(short)350, (float)9.90);

        System.out.println("Existe " + cartola.getQuantidade() +" " + cartola.getNome() +"s" );
        System.out.println("Existe " + touca.getQuantidade() +" " + touca.getNome() +"s" );

        Item item1 = new Item(cartola.getCodigo(), cartola, (short)10);
        Item item2 = new Item(touca.getCodigo(), touca, (short)238);
        Item item3 = new Item(555,new Produto(555,"Chapéu Coco",(short)30, (float)39.90),(short)7);

        System.out.println("Pós as vendas existe agora "+ (cartola.getQuantidade() - item1.getQuantidadeVendida()) + " " + cartola.getNome() +"s" );
        System.out.println("Pós as vendas existe agora "+ (touca.getQuantidade() - item2.getQuantidadeVendida()) + " " + touca.getNome() +"s" );
        System.out.println("Pós as vendas existe agora "+ (item3.getProduto().getQuantidade() - item3.getQuantidadeVendida()) + " " + item3.getProduto().getNome() +"s" );
    }
}
