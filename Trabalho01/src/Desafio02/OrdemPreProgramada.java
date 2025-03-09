package Desafio02;

public class OrdemPreProgramada extends Ordem {
    private AcaoDaBolsa acao;

    public OrdemPreProgramada(Investidor investidor, TipoOrdem tipoOrdem, double valor, AcaoDaBolsa acao)  {
        super(investidor, tipoOrdem, valor);
        this.acao = acao;
    }

    public AcaoDaBolsa getAcao() {
        return acao;
    }

    public void setAcao(AcaoDaBolsa acao) {
        this.acao = acao;
    }
}
