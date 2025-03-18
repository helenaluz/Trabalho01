package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ArCondicionadoVentoBaumnAdapter  implements DispositivoArcondicionado{

    private ArCondicionadoVentoBaumn arCondicionadoVentoBaumn;

    public ArCondicionadoVentoBaumnAdapter(ArCondicionadoVentoBaumn arCondicionadoVentoBaumn) {
        this.arCondicionadoVentoBaumn = arCondicionadoVentoBaumn;
    }

    @Override
    public void aumentarTemperatura() {
        int tempAtual = arCondicionadoVentoBaumn.getTemperatura();
        int tempDesejada = tempAtual++;
        arCondicionadoVentoBaumn.definirTemperatura(tempDesejada);
    }

    @Override
    public void diminuirTemperatura() {
        int tempAtual = arCondicionadoVentoBaumn.getTemperatura();
        int tempDesejada = tempAtual--;
        arCondicionadoVentoBaumn.definirTemperatura(tempDesejada);
    }

    @Override
    public void setTemperatura(int temperatura) {
        arCondicionadoVentoBaumn.definirTemperatura(temperatura);
    }

    @Override
    public void ligar() {
        arCondicionadoVentoBaumn.ligar();
    }

    @Override
    public void desligar() {
        arCondicionadoVentoBaumn.desligar();
    }
}
