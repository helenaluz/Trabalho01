package org.example;

import br.furb.analise.algoritmos.PersianaNatLight;

public class PersianaNatLightAdapter implements DispositivoPersiana{

    private PersianaNatLight persianaNatLight;

    public PersianaNatLightAdapter(PersianaNatLight persianaNatLight) {
        this.persianaNatLight = persianaNatLight;
    }

    @Override
    public void Abrir() throws Exception {
        if(persianaNatLight.estaPalhetaErguida())
            persianaNatLight.abrirPalheta();

        persianaNatLight.subirPalheta();
    }

    @Override
    public void Fechar() throws Exception {
        if(persianaNatLight.estaPalhetaErguida())
            persianaNatLight.abrirPalheta();

        persianaNatLight.descerPalheta();
        persianaNatLight.fecharPalheta();
    }
}
