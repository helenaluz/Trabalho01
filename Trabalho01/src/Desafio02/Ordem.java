package Desafio02;

public class Ordem {
    private Investidor investidor;
    private TipoOrdem tipo;
    private double valor;

    public Ordem(Investidor investidor, TipoOrdem tipo, double valor) {
        this.investidor = investidor;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public TipoOrdem getTipo() {
        return tipo;
    }

    public void setTipo(TipoOrdem tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
