package Desafio02;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AcaoTest {
    private Acao acao;
    private Observador observador;
    private Ordem ordem;   
    
    @BeforeEach
    void setUp() {
        acao = new Acao("PETR4", 25.0);
        observador = new Observador() {
            @Override
            public void update(Acao acao) {
                System.out.println("Observador foi notificado sobre mudança na ação: " + acao.getNome());
            }
        };
        ordem = new Ordem(new Investidor("João"), TipoOrdem.Compra, 25.0);
    }


    @Test
    void testAdicionarObservador() {
        assertDoesNotThrow(() -> acao.adicionarObservador(observador));
    }

    @Test
    void testAtualizarValorAcao() {
        acao.atualizarValorAcao(30.0);
        assertEquals(30.0, acao.getValor());
    }

    @Test
    void testRegistrarOrdem() {
        acao.registrarOrdem(ordem);
        assertEquals(25.0, acao.getValor());
    }

    @Test
    void testRemoverObservador() {
        acao.adicionarObservador(observador);
        assertDoesNotThrow(() -> acao.removerObservador(observador));
    }

    @Test
    void testRemoverObservadorNaoExistente() {
        Exception exception = assertThrows(Exception.class, () -> acao.removerObservador(observador));
        assertEquals("Esse observador não está na lista de observadores", exception.getMessage());
    }

}
