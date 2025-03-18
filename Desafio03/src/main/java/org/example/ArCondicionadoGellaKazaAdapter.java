package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class ArCondicionadoGellaKazaAdapter implements DispositivoArcondicionado{

    private ArCondicionadoGellaKaza arCondicionadoGellaKaza;

    public ArCondicionadoGellaKazaAdapter(ArCondicionadoGellaKaza arCondicionadoGellaKaza) {
        this.arCondicionadoGellaKaza = arCondicionadoGellaKaza;
    }

    @Override
    public void AumentarTemperatura() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.aumentarTemperatura();
    }

    @Override
    public void DiminuirTemperatura() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.diminuirTemperatura();
    }

    @Override
    public void SetTemperatura(int temperatura) {
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
    public void Ligar() {
        if(!arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.ativar();
    }

    @Override
    public void Desligar() {
        if(arCondicionadoGellaKaza.estaLigado())
            arCondicionadoGellaKaza.desativar();
    }
}
