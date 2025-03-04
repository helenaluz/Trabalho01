package Desafio02;

import java.util.*;
import java.util.stream.Collectors;

public class Investidor implements Observador{
    private String nome;
    private ArrayList<OrdemPreProgramada> ordensPreProgramadas;
    private ArrayList<Acao> acoesNotificao ;
    
    public Investidor(String nome) {
        this.nome = nome;
        this.ordensPreProgramadas = new ArrayList<>();
        this.acoesNotificao = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Acao> getAcoesNotificao() {
        return acoesNotificao;
    }
    
    public ArrayList<OrdemPreProgramada> getOrdensPreProgramadas() {
        return ordensPreProgramadas;
    }

    @Override
    public void update(Acao acao) {
        verificarNotificao(acao);
        verificarOrdensPreProgramadas(acao);
    }

    public void registrarOrdem(TipoOrdem tipo,Acao acao, double valor){
        Ordem ordem = new Ordem(this, tipo,valor);
        acao.registrarOrdem(ordem);
    }

    public void adicionarOrdemPreProgramada(TipoOrdem tipo, Acao acao, double valor){
        Ordem ordem = new Ordem(this, tipo,valor);
        OrdemPreProgramada ordemPreProgramada = new OrdemPreProgramada(ordem,acao);
        ordensPreProgramadas.add(ordemPreProgramada);
    }

    public void adicionarAcaoNotificao(Acao acao){
        acoesNotificao.add(acao);
    }

    private void verificarNotificao(Acao acao){
        if(acoesNotificao.stream().anyMatch(p-> p.equals(acao))){
            notificarAcaoMudancaPreco(acao);
        }
    }

    private void verificarOrdensPreProgramadas(Acao acao){
        List<OrdemPreProgramada> ordensPreProgramadasFiltradas = ordensPreProgramadas.stream()
                .filter(p -> p.getOrdem().getValor() == acao.getValor() && p.getAcao().getNome().equals(acao.getNome()))
                .collect(Collectors.toList());

        if(!ordensPreProgramadasFiltradas.isEmpty()){
            enviarOrdemPreProgramada(ordensPreProgramadasFiltradas);
        }    }

    private void notificarAcaoMudancaPreco(Acao acao){
        System.out.println("A ação "+acao.getNome()+" está com valor R$"+acao.getValor());
    }

    private void enviarOrdemPreProgramada(List<OrdemPreProgramada> ordensPreProgramadasFiltradas){
        for(OrdemPreProgramada ordemPreProgramada : ordensPreProgramadasFiltradas){
            ordemPreProgramada.getAcao().registrarOrdem(ordemPreProgramada.getOrdem());
        }
    }
}
