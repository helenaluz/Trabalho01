package org.example;

import br.furb.analise.algoritmos.PersianaNatLight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersianaNatLightAdapterTest {

    @Test
    void abrir() throws Exception {
        PersianaNatLight persianaNatLight = new PersianaNatLight();
        persianaNatLight.abrirPalheta();
        persianaNatLight.subirPalheta();
        PersianaNatLightAdapter persianaNatLightAdapter = new PersianaNatLightAdapter(persianaNatLight);
        persianaNatLightAdapter.abrir();
        assertEquals(persianaNatLight.estaPalhetaErguida(), true);
    }

    @Test
    void fechar() throws Exception {
        PersianaNatLight persianaNatLight = new PersianaNatLight();
        persianaNatLight.abrirPalheta();
        persianaNatLight.subirPalheta();
        PersianaNatLightAdapter persianaNatLightAdapter = new PersianaNatLightAdapter(persianaNatLight);
        persianaNatLightAdapter.fechar();
        assertEquals(persianaNatLight.estaPalhetaAberta(), false);
    }
}