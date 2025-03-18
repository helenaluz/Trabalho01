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

    }

    @Override
    public void DiminuirTemperatura() {

    }

    @Override
    public void SetTemperatura(int temperatura) {

    }

    @Override
    public void Ligar() {

    }

    @Override
    public void Desligar() {

    }
}
