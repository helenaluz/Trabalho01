package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ArCondicionadoVentoBaumnAdapter  implements DispositivoArcondicionado{

    private ArCondicionadoVentoBaumn arCondicionado;

    public ArCondicionadoVentoBaumnAdapter(ArCondicionadoVentoBaumn arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void AumentarTemperatura() {
        int tempAtual = arCondicionado.getTemperatura();
        int tempDesejada = tempAtual++;
        arCondicionado.definirTemperatura(tempDesejada);
    }

    @Override
    public void DiminuirTemperatura() {
        int tempAtual = arCondicionado.getTemperatura();
        int tempDesejada = tempAtual--;
        arCondicionado.definirTemperatura(tempDesejada);
    }

    @Override
    public void SetTemperatura(int temperatura) {
        arCondicionado.definirTemperatura(temperatura);
    }

    @Override
    public void Ligar() {
        arCondicionado.ligar();
    }

    @Override
    public void Desligar() {
        arCondicionado.desligar();
    }
}
