public class Produto {
    String nomeProduto;
    Double preco;

    public Produto(String nomeProduto, Double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }
}
