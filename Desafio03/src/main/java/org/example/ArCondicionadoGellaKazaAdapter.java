package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class ArCondicionadoGellaKazaAdapter implements DispositivoArcondicionado{

    private ArCondicionadoGellaKaza arCondicionadoGellaKaza;

    public ArCondicionadoGellaKazaAdapter(ArCondicionadoGellaKaza arCondicionadoGellaKaza) {
        this.arCondicionadoGellaKaza = arCondicionadoGellaKaza;
    }

    @Override
    public void aumentarTemperatura() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.aumentarTemperatura();
    }

    @Override
    public void diminuirTemperatura() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.diminuirTemperatura();
    }

    @Override
    public void setTemperatura(int temperatura) {
        if(arCondicionadoGellaKaza.estaLigado()){
            int tempAtual = arCondicionadoGellaKaza.getTemperatura();
            int diferencaTemp = temperatura - tempAtual;

            if(diferencaTemp > 0){
                for(int i = 0; i< diferencaTemp; i++){
                    arCondicionadoGellaKaza.aumentarTemperatura();
                }
            }

            if(diferencaTemp < 0){
                diferencaTemp *= -1;
                for(int i = 0; i< diferencaTemp; i++){
                    arCondicionadoGellaKaza.diminuirTemperatura();
                }
            }

        }
    }

    @Override
    public void ligar() {
        if(!arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.ativar();
    }

    @Override
    public void desligar() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.desativar();
    }
}
