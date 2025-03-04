package Desafio02;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvestidorTest {

    private Investidor investidor;
    private Acao acao;

    @BeforeEach
    void setUp() {
        investidor = new Investidor("Carlos");
        acao = new Acao("VALE3", 80.0);
    }

    @Test
    void testAdicionarAcaoNotificao() {
        investidor.adicionarAcaoNotificao(acao);
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
}
