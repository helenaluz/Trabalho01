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
        condicionadoGellaKazaAdapter.ligar();
        condicionadoGellaKazaAdapter.setTemperatura(20);
        condicionadoGellaKazaAdapter.aumentarTemperatura();
        assertEquals(21, condicionadoGellaKaza.getTemperatura());
    }

    @Test
    void diminuirTemperatura() {
        ArCondicionadoGellaKaza condicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter condicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(condicionadoGellaKaza);
        condicionadoGellaKazaAdapter.ligar();
        condicionadoGellaKazaAdapter.setTemperatura(20);
        condicionadoGellaKazaAdapter.diminuirTemperatura();
        assertEquals(19, condicionadoGellaKaza.getTemperatura());
    }

    @Test
    void setTemperatura() {
        ArCondicionadoGellaKaza condicionadoGellaKaza = new ArCondicionadoGellaKaza();
        ArCondicionadoGellaKazaAdapter condicionadoGellaKazaAdapter = new ArCondicionadoGellaKazaAdapter(condicionadoGellaKaza);
        condicionadoGellaKazaAdapter.ligar();
        condicionadoGellaKazaAdapter.setTemperatura(27);
        assertEquals(27, condicionadoGellaKaza.getTemperatura());
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