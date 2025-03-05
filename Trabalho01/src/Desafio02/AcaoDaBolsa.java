package Desafio02;

import java.util.*;

public class AcaoDaBolsa implements Sujeito {
    private String nome;
    private double valor;
    private ArrayList<Ordem> ordens;
    private ArrayList<Observador> observadores;

    public AcaoDaBolsa(String nome, double valor) {
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

    public ArrayList<Ordem> getOrdens() {
        return ordens;
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

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void atualizarValorAcao(double valor) {

        if (this.valor != valor) {
            this.valor = valor;
            notificarObservadores();
        }
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this);
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
