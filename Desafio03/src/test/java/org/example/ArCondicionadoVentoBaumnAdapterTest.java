package org.example;

import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArCondicionadoVentoBaumnAdapterTest {

    @Test
    void aumentarTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.ligar();
        arCondicionadoVentoBaumnAdapter.setTemperatura(15);
        arCondicionadoVentoBaumnAdapter.aumentarTemperatura();
        assertEquals(arCondicionadoVentoBaumn.getTemperatura(), 16);
    }

    @Test
    void diminuirTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.ligar();
        arCondicionadoVentoBaumnAdapter.setTemperatura(16);
        arCondicionadoVentoBaumnAdapter.diminuirTemperatura();
        assertEquals(arCondicionadoVentoBaumn.getTemperatura(), 15);
    }

    @Test
    void setTemperatura() {
        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoVentoBaumnAdapter arCondicionadoVentoBaumnAdapter = new ArCondicionadoVentoBaumnAdapter(arCondicionadoVentoBaumn);
        arCondicionadoVentoBaumnAdapter.ligar();

        arCondicionadoVentoBaumnAdapter.setTemperatura(20);
        assertEquals(20, arCondicionadoVentoBaumn.getTemperatura());
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