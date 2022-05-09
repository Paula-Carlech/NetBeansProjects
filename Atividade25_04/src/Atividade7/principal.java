package Atividade7;

public class principal {

    public static void main(String args[]) {
        
        Produto p = new Produto();
        Item i = new Item();
        Pedido ped = new Pedido();
        
        p.nome = "Sabão";
        p.preco = 2.50f;
        p.qtdEstoque = 500;
        
        i.nomeProduto = "Sabão";
        i.qtdProduto = 3;
        
        ped.pagamento = "Cartão";
    }
}