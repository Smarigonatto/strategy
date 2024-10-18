import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> lista = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        this.lista = new ArrayList<>();
    }

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }

    public void removeProduto(Produto produto){
        this.lista.remove(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public Double getTotalComDesconto() {
        Double totalComDesconto = 0.0;

        for(Produto produto : this.lista){
            totalComDesconto += descontoStrategy.calcularDesconto(produto.getPreco());
        }

        return totalComDesconto;
    }

}
