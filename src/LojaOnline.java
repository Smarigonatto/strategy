public class LojaOnline {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);
        carrinho.addProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$ " + carrinho.getTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: R$ " + carrinho.getTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: R$ " + carrinho.getTotalComDesconto());

    }
}