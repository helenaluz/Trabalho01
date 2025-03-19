package org.example;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampadaShoyuMiAdapterTest {

    @Test
    void ligar() {
        LampadaShoyuMi lampadaShoyuMi = new LampadaShoyuMi();
        lampadaShoyuMi.desligar();
        LampadaShoyuMiAdapter lampadaShoyuMiAdapter = new LampadaShoyuMiAdapter(lampadaShoyuMi);
        lampadaShoyuMiAdapter.ligar();
        assertEquals(true, lampadaShoyuMi.estaLigada());
    }

    @Test
    void desligar() {
        LampadaShoyuMi lampadaShoyuMi = new LampadaShoyuMi();
        lampadaShoyuMi.ligar();
        LampadaShoyuMiAdapter lampadaShoyuMiAdapter = new LampadaShoyuMiAdapter(lampadaShoyuMi);
        lampadaShoyuMiAdapter.desligar();
        assertEquals(false, lampadaShoyuMi.estaLigada());
    }
}