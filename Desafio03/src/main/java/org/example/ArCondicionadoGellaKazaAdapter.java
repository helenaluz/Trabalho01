package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class ArCondicionadoGellaKazaAdapter implements DispositivoArcondicionado{

    private ArCondicionadoGellaKaza arCondicionado;

    public ArCondicionadoGellaKazaAdapter(ArCondicionadoGellaKaza arCondicionado) {
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
