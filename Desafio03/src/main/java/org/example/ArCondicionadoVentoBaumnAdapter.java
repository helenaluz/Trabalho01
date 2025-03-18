package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ArCondicionadoVentoBaumnAdapter  implements DispositivoArcondicionado{

    private ArCondicionadoVentoBaumn arCondicionadoVentoBaumn;

    public ArCondicionadoVentoBaumnAdapter(ArCondicionadoVentoBaumn arCondicionadoVentoBaumn) {
        this.arCondicionadoVentoBaumn = arCondicionadoVentoBaumn;
    }

    @Override
    public void AumentarTemperatura() {
        int tempAtual = arCondicionadoVentoBaumn.getTemperatura();
        int tempDesejada = tempAtual++;
        arCondicionadoVentoBaumn.definirTemperatura(tempDesejada);
    }

    @Override
    public void DiminuirTemperatura() {
        int tempAtual = arCondicionadoVentoBaumn.getTemperatura();
        int tempDesejada = tempAtual--;
        arCondicionadoVentoBaumn.definirTemperatura(tempDesejada);
    }

    @Override
    public void SetTemperatura(int temperatura) {
        arCondicionadoVentoBaumn.definirTemperatura(temperatura);
    }

    @Override
    public void Ligar() {
        arCondicionadoVentoBaumn.ligar();
    }

    @Override
    public void Desligar() {
        arCondicionadoVentoBaumn.desligar();
    }
}
