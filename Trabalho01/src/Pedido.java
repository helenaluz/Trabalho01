import java.util.ArrayList;

public class Pedido {
    public ArrayList<Produto> Produtos = new ArrayList<>();
    public EntregaStrategy FormaEntrega;

    public void AdicionarProduto(Produto produto){
        Produtos.add(produto);
    }

    public void ProcessarFrete(){
        Double
    }
}
