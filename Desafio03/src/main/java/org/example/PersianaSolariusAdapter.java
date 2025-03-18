package org.example;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class PersianaSolariusAdapter implements DispositivoPersiana{

    private PersianaSolarius persianaSolarius;

    public PersianaSolariusAdapter(PersianaSolarius persianaSolarius) {
        this.persianaSolarius = persianaSolarius;
    }

    @Override
    public void Abrir() {
        if(persianaSolarius.estaAberta())
    }

    @Override
    public void Fechar() {

    }
}