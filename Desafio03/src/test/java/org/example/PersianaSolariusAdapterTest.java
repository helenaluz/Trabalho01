package org.example;

import br.furb.analise.algoritmos.PersianaSolarius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersianaSolariusAdapterTest {

    @Test
    void abrir() {
        PersianaSolarius persianaSolarius = new PersianaSolarius();
        persianaSolarius.descerPersiana();
        PersianaSolariusAdapter persianaSolariusAdapter = new PersianaSolariusAdapter(persianaSolarius);
        persianaSolariusAdapter.abrir();
        assertEquals(persianaSolarius.estaAberta(), true);
    }

    @Test
    void fechar() {
        PersianaSolarius persianaSolarius = new PersianaSolarius();
        persianaSolarius.subirPersiana();
        PersianaSolariusAdapter persianaSolariusAdapter = new PersianaSolariusAdapter(persianaSolarius);
        persianaSolariusAdapter.fechar();
        assertEquals(persianaSolarius.estaAberta(), false);
    }
}