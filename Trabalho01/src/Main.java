import Desafio02.*;

public class Main {
    public static void main(String[] args) {
        Investidor teste = new Investidor("Teste");
        Investidor observador2 = new Investidor("Teste2");

        AcaoDaBolsa acao01 = new AcaoDaBolsa("01", 100);
        AcaoDaBolsa acao02 = new AcaoDaBolsa("02", 20);

        acao01.adicionarObservador(teste);
        acao01.adicionarObservador(observador2);
        acao02.adicionarObservador(teste);
        acao02.adicionarObservador(observador2);

        teste.seRegistrarEmAcao(acao01);
        teste.adicionarOrdemPreProgramada(TipoOrdem.Venda,acao01,200);
        observador2.adicionarOrdemPreProgramada(TipoOrdem.Compra, acao01, 200);

        teste.registrarOrdem(TipoOrdem.Compra, acao01, 150.0);
        observador2.registrarOrdem(TipoOrdem.Venda, acao01, 150.0);

        acao01.atualizarValorAcao(200);
    }
}
