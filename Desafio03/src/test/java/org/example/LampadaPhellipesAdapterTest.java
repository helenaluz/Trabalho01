package org.example;

import br.furb.analise.algoritmos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampadaPhellipesAdapterTest {

    @Test
    void ligar() {
        LampadaPhellipes lampadaPhellipes = new LampadaPhellipes();
        lampadaPhellipes.setIntensidade(0);
        LampadaPhellipesAdapter lampadaPhellipesAdapter = new LampadaPhellipesAdapter(lampadaPhellipes);
        lampadaPhellipesAdapter.ligar();
        assertEquals(lampadaPhellipes.getIntensidade(),100);
    }

    @Test
    void desligar() {
        LampadaPhellipes lampadaPhellipes = new LampadaPhellipes();
        lampadaPhellipes.setIntensidade(100);
        LampadaPhellipesAdapter lampadaPhellipesAdapter = new LampadaPhellipesAdapter(lampadaPhellipes);
        lampadaPhellipesAdapter.desligar();
        assertEquals(lampadaPhellipes.getIntensidade(),0);
    }
}