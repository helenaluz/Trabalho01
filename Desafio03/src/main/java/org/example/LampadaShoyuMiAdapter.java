package org.example;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class LampadaShoyuMiAdapter implements Dispositivo{
    private LampadaShoyuMi lampadaShoyuMi;

    public LampadaShoyuMiAdapter(LampadaShoyuMi lampadaShoyuMi) {
        this.lampadaShoyuMi = lampadaShoyuMi;
    }

    @Override
    public void Ligar() {
        if(!lampadaShoyuMi.estaLigada())
            lampadaShoyuMi.desligar();
    }

    @Override
    public void Desligar() {
        if(lampadaShoyuMi.estaLigada())
            lampadaShoyuMi.ligar();
    }
}
