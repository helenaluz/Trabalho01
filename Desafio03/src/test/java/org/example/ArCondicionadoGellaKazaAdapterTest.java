package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArCondicionadoGellaKazaAdapterTest {

    @Test
    void aumentarTemperatura() {
        ArCondicionadoGellaKaza condicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter condicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(condicionadoGellaKaza);
        condicionadoGellaKazaAdapter.setTemperatura(2);
        condicionadoGellaKazaAdapter.aumentarTemperatura();
        assertEquals(3, condicionadoGellaKaza.getTemperatura());
    }

    @Test
    void diminuirTemperatura() {
        ArCondicionadoGellaKaza condicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter condicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(condicionadoGellaKaza);
        condicionadoGellaKazaAdapter.setTemperatura(2);
        condicionadoGellaKazaAdapter.diminuirTemperatura();
        assertEquals(1, condicionadoGellaKaza.getTemperatura());
    }

    @Test
    void setTemperatura() {
        ArCondicionadoGellaKaza condicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter condicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(condicionadoGellaKaza);
        condicionadoGellaKazaAdapter.setTemperatura(2);
        assertEquals(2, condicionadoGellaKaza.getTemperatura());
    }

    @Test
    void ligar() {
        ArCondicionadoGellaKaza arCondicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter arCondicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(arCondicionadoGellaKaza);
        arCondicionadoGellaKazaAdapter.ligar();
        assertEquals(arCondicionadoGellaKaza.estaLigado(), true);
    }

    @Test
    void desligar() {
        ArCondicionadoGellaKaza arCondicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter arCondicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(arCondicionadoGellaKaza);
        arCondicionadoGellaKazaAdapter.desligar();
        assertEquals(arCondicionadoGellaKaza.estaLigado(), false);
    }
}