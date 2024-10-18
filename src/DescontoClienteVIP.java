public class DescontoClienteVIP implements DescontoStrategy{
    @Override
    public double calcularDesconto(Double preco) {
        return preco * 0.80;
    }
}
