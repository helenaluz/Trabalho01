package Desafio02;

public class OrdemPreProgramada {
    private Ordem ordem;
    private Acao acao;

    public OrdemPreProgramada(Ordem ordem, Acao acao) {
        this.ordem = ordem;
        this.acao = acao;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }
}
