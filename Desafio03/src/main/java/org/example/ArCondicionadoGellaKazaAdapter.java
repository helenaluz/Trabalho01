package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class ArCondicionadoGellaKazaAdapter implements DispositivoArcondicionado{

    private ArCondicionadoGellaKaza arCondicionado;

    public ArCondicionadoGellaKazaAdapter(ArCondicionadoGellaKaza arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void AumentarTemperatura() {
        if(arCondicionado.estaLigado())
            arCondicionado.aumentarTemperatura();
    }

    @Override
    public void DiminuirTemperatura() {
        if(arCondicionado.estaLigado())
            arCondicionado.diminuirTemperatura();
    }

    @Override
    public void SetTemperatura(int temperatura) {
        if(arCondicionado.estaLigado()){
            int tempAtual = arCondicionado.getTemperatura();
            int diferencaTemp = temperatura - tempAtual;

            if(diferencaTemp > 0){
                for(int i = 0; i< diferencaTemp; i++){
                    arCondicionado.aumentarTemperatura();
                }
            }

            if(diferencaTemp < 0){
                diferencaTemp *= -1;
                for(int i = 0; i< diferencaTemp; i++){
                    arCondicionado.diminuirTemperatura();
                }
            }

        }
    }

    @Override
    public void Ligar() {
        if(!arCondicionado.estaLigado())
            arCondicionado.ativar();
    }

    @Override
    public void Desligar() {
        if(arCondicionado.estaLigado())
            arCondicionado.desativar();
    }
}
