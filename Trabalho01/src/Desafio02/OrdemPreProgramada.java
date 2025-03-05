package Desafio02;

public class OrdemPreProgramada {
    private Ordem ordem;
    private AcaoDaBolsa acao;

    public OrdemPreProgramada(Ordem ordem, AcaoDaBolsa acao) {
        this.ordem = ordem;
        this.acao = acao;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public AcaoDaBolsa getAcao() {
        return acao;
    }

    public void setAcao(AcaoDaBolsa acao) {
        this.acao = acao;
    }
}
