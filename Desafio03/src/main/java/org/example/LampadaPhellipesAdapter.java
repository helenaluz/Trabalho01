package org.example;

import br.furb.analise.algoritmos.LampadaPhellipes;

public class LampadaPhellipesAdapter implements Dispositivo{
    private LampadaPhellipes lampadaPhellipes;

    public LampadaPhellipesAdapter(LampadaPhellipes lampadaPhellipes) {
        this.lampadaPhellipes = lampadaPhellipes;
    }

    @Override
    public void ligar() {
        if(lampadaPhellipes.getIntensidade() == 0)
            lampadaPhellipes.setIntensidade(100);
    }

    @Override
    public void desligar() {
        if(lampadaPhellipes.getIntensidade() == 100)
            lampadaPhellipes.setIntensidade(0);
    }
}
