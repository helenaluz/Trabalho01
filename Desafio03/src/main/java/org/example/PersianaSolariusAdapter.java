package org.example;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class PersianaSolariusAdapter implements DispositivoPersiana{

    private PersianaSolarius persianaSolarius;

    public PersianaSolariusAdapter(PersianaSolarius persianaSolarius) {
        this.persianaSolarius = persianaSolarius;
    }

    @Override
    public void abrir() {
        if(!persianaSolarius.estaAberta())
            persianaSolarius.subirPersiana();
    }

    @Override
    public void fechar() {
        if(persianaSolarius.estaAberta())
            persianaSolarius.descerPersiana();
    }
}