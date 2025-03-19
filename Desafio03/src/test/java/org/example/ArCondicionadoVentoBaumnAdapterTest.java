package org.example;

import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArCondicionadoVentoBaumnAdapterTest {

    @Test
    void aumentarTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        arCondicionadoVentoBaumn.definirTemperatura(2);
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.aumentarTemperatura();
        assertEquals(arCondicionadoVentoBaumn.getTemperatura(), 3);
    }

    @Test
    void diminuirTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        arCondicionadoVentoBaumn.definirTemperatura(2);
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.diminuirTemperatura();
        assertEquals(arCondicionadoVentoBaumn.getTemperatura(), 1);
    }

    @Test
    void setTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.setTemperatura(2);
        assertEquals(2, arCondicionadoVentoBaumn.getTemperatura());
    }

    @Test
    void ligar() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.ligar();
    }

    @Test
    void desligar() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.desligar();
    }
}