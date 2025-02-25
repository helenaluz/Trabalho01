import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pedido {
    public ArrayList<Produto> produtos = new ArrayList<>();
    public EntregaStrategy FormaEntrega;

    public Pedido(EntregaStrategy formaEntrega) {
        FormaEntrega = formaEntrega;
    }

    public Double FecharPedido(){
        try{
            Double totalValorProdutos = CalcularValorProdutoTotal();
            Double totalValorFrete = ProcessarFrete();

            Double valorTotalAPagar = totalValorFrete + totalValorProdutos;

            return valorTotalAPagar;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    private Double CalcularValorProdutoTotal(){
        Double somaTotalValor = produtos.stream()
                .mapToDouble(Produto::getValor).sum();

        return somaTotalValor;
    }

    public void AdicionarProduto(Produto produto){
        produtos.add(produto);
    }

    private Double ProcessarFrete(){
        Double pesoTotalPedidos = CalcularPesoTotal();
        Double valorFrete = FormaEntrega.CalculaFrete(pesoTotalPedidos);

        return valorFrete;
    }

    private Double CalcularPesoTotal(){
        Double somaTotalPeso = produtos.stream()
                .mapToDouble(Produto::getPeso).sum();

        return somaTotalPeso;
    }
}
