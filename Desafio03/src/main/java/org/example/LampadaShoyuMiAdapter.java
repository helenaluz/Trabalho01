package org.example;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class LampadaShoyuMiAdapter implements Dispositivo{
    private LampadaShoyuMi lampadaShoyuMi;

    public LampadaShoyuMiAdapter(LampadaShoyuMi lampadaShoyuMi) {
        this.lampadaShoyuMi = lampadaShoyuMi;
    }

    @Override
    public void ligar() {
        if(!lampadaShoyuMi.estaLigada())
            lampadaShoyuMi.desligar();
    }

    @Override
    public void desligar() {
        if(lampadaShoyuMi.estaLigada())
            lampadaShoyuMi.ligar();
    }
}
