import java.util.ArrayList;

public class Pedido {
    public ArrayList<Produto> produtos = new ArrayList<>();
    public EntregaStrategy FormaEntrega;

    public Pedido(EntregaStrategy formaEntrega) {
        FormaEntrega = formaEntrega;
    }

    public Double gerarValorTotalDoPagamento() {
        try {
            Double totalValorProdutos = calcularValorProdutoTotal();
            Double totalValorFrete = processarFrete();

            Double valorTotalAPagar = totalValorFrete + totalValorProdutos;

            return valorTotalAPagar;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    private Double calcularValorProdutoTotal() {
        Double somaTotalValor = produtos.stream()
                .mapToDouble(Produto::getValor).sum();

        return somaTotalValor;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    private Double processarFrete() {
        Double pesoTotalPedidos = calcularPesoTotal();
        Double valorFrete = FormaEntrega.CalculaFrete(pesoTotalPedidos);

        return valorFrete;
    }

    private Double calcularPesoTotal() {
        Double somaTotalPeso = produtos.stream()
                .mapToDouble(Produto::getPeso).sum();

        return somaTotalPeso;
    }
}
