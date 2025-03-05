package Desafio02;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvestidorTest {

    private Investidor investidor;
    private AcaoDaBolsa acao;

    @BeforeEach
    void setUp() {
        investidor = new Investidor("Carlos");
        acao = new AcaoDaBolsa("VALE3", 80.0);
    }

    @Test
    void testAdicionarAcaoNotificao() {
        investidor.seRegistrarEmAcao(acao);
        assertTrue(investidor.getAcoesNotificao().contains(acao));
    }

    @Test
    void testAdicionarOrdemPreProgramada() {
        assertDoesNotThrow(() -> investidor.adicionarOrdemPreProgramada(TipoOrdem.Compra, acao, 80.0));
    }

    @Test
    void testRegistrarOrdem() {
        assertDoesNotThrow(() -> investidor.registrarOrdem(TipoOrdem.Compra, acao, 80.0));
    }

    @Test
    void testReceberNotificacaoDeMudancaPreco() {
        investidor.seRegistrarEmAcao(acao);
        acao.atualizarValorAcao(85.0);
        assertTrue(investidor.getAcoesNotificao().contains(acao));
    }

    @Test
    void testEnviarOrdemPreProgramadaQuandoValorCorresponde() {
        investidor.adicionarOrdemPreProgramada(TipoOrdem.Venda, acao, 85.0);
        acao.atualizarValorAcao(85.0);
        List<OrdemPreProgramada> ordens = investidor.getOrdensPreProgramadas();
        assertTrue(ordens.stream().anyMatch(o -> o.getAcao().equals(acao) && o.getOrdem().getValor() == 85.0));
    }

    @Test
    void testNaoEnviarOrdemPreProgramadaSeValorNaoAtingido() {
        investidor.adicionarOrdemPreProgramada(TipoOrdem.Compra, acao, 90.0);
        acao.atualizarValorAcao(85.0);
        assertTrue(investidor.getOrdensPreProgramadas().size() > 0);
    }
}
