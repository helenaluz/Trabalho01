package org.example;

import java.util.ArrayList;

public class SmartHomeFacade {
    ArrayList<DispositivoPersiana> dispositivoPersiana;
    ArrayList<Dispositivo> dispositivos;
    ArrayList<DispositivoArcondicionado> dispositivoArcondicionados;

    public SmartHomeFacade(ArrayList<DispositivoPersiana> dispositivoPersiana, ArrayList<DispositivoArcondicionado> dispositivoArcondicionados, ArrayList<Dispositivo> dispositivos) {
        this.dispositivoPersiana = dispositivoPersiana;
        this.dispositivoArcondicionados = dispositivoArcondicionados;
        this.dispositivos = dispositivos;
    }

    public SmartHomeFacade() {
        this.dispositivoPersiana = new ArrayList<DispositivoPersiana>();
        this.dispositivoArcondicionados =  new ArrayList<>();
        this.dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivoPersiana(DispositivoPersiana dispositivoPersiana){
        this.dispositivoPersiana.add(dispositivoPersiana);
    }

    public void removerDispositivoPersiana(DispositivoPersiana dispositivoPersiana){
        this.dispositivoPersiana.remove(dispositivoPersiana);
    }

    public void adicionarDispositivoArcondicionado(DispositivoArcondicionado dispositivoArcondicionado){
        this.dispositivoArcondicionados.add(dispositivoArcondicionado);
    }

    public void removerDispositivoArcondicionado(DispositivoArcondicionado dispositivoArcondicionado){
        this.dispositivoArcondicionados.add(dispositivoArcondicionado);
    }

    public void adicionarDispositivo(Dispositivo dispositivo){
        this.dispositivos.add(dispositivo);
    }

    public void removerDispositivo(Dispositivo dispositivo){
        this.dispositivos.remove(dispositivo);
    }

    public void ativarModoSono(){
        this.dispositivos.forEach(Dispositivo::desligar);
        this.dispositivoArcondicionados.forEach(DispositivoArcondicionado::desligar);
        this.dispositivoPersiana.forEach(p -> {
            try {
                p.fechar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void ativarModoTrabalho(){
        this.dispositivos.forEach(Dispositivo::ligar);
        this.dispositivoArcondicionados.forEach(DispositivoArcondicionado::ligar);
        this.dispositivoPersiana.forEach(p -> {
            try {
                p.abrir();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        int tempDesejada = 25;

        this.dispositivoArcondicionados.forEach(p -> p.setTemperatura(tempDesejada));
    }
}
