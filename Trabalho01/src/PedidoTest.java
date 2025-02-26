import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PedidoTest {
    @Test
    public void testAdicionarProduto() {

    }

    @Test
    public void testGerarValorTotalDoPagamento() {
        EncomendaPac ecomenda1 = new EncomendaPac();
        Produto produto1 = new Produto("xurastei", 10.0, 250.0);
        Produto produto2 = new Produto("mingau", 2.0, 250.0);
        Produto produto3 = new Produto("lapiseira", 30.0, 250.0);


        Pedido pedido1 = new Pedido(ecomenda1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido1.adicionarProduto(produto3);

        double resultado = pedido1.gerarValorTotalDoPagamento();

        assertEquals(52.0, resultado, 0.001);
        
    }

    @Test
    public void testGerarValorTotalDoPagamento2() {
        EncomendaSedex ecomenda1 = new EncomendaSedex();
        Produto produto1 = new Produto("pamplona nao te abandona", 10.0, 250.0);
        Produto produto2 = new Produto("boliña de golfe", 2.0, 7000.0);
        Produto produto3 = new Produto("pinacolada", 30.0, 750.0);


        Pedido pedido1 = new Pedido(ecomenda1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido1.adicionarProduto(produto3);

        double resultado = pedido1.gerarValorTotalDoPagamento();

        assertEquals(178.5, resultado, 0.001);
        
    }
}
