package Desafio02;

import java.util.*;

public class Acao {
    private String nome;
    private double valor;
    private ArrayList<Ordem> ordens;
    private ArrayList<Observador> observadores;

    public Acao(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.ordens = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void registrarOrdem(Ordem ordem) {
        ordens.add(ordem);
        verificarMatch();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) throws Exception {
        boolean existeObservador = observadores.stream()
                .anyMatch(p -> p.equals(observador));

        if (!existeObservador)
            throw new Exception("Esse observador não está na lista de observadores");

        observadores.remove(observador);
    }

    public void atualizarValorAcao(double valor) {

        if (this.valor != valor) {
            this.valor = valor;
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.update(this);
        }
    }

    private void verificarMatch() {
        double resultado = this.valor;
        List<Ordem> ordensParaRemover = new ArrayList<>();

        for (Ordem compra : ordens) {
            if (compra.getTipo() == TipoOrdem.Compra) {
                for (Ordem venda : ordens) {
                    if (venda.getTipo() == TipoOrdem.Venda && venda.getValor() == compra.getValor()) {
                        resultado = compra.getValor();
                        ordensParaRemover.add(compra);
                        ordensParaRemover.add(venda);
                        break;
                    }
                }
            }

            if (!ordensParaRemover.isEmpty()) {
                break;
            }
        }

        ordens.removeAll(ordensParaRemover);

        atualizarValorAcao(resultado);
    }

}
