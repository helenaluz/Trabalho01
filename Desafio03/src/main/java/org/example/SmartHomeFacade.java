package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public void AdicionarDispositivoPersiana(DispositivoPersiana dispositivoPersiana){
        this.dispositivoPersiana.add(dispositivoPersiana);
    }

    public void RemoverDispositivoPersiana(DispositivoPersiana dispositivoPersiana){
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

    public void ModoSono(){
        this.dispositivos.forEach(Dispositivo::Desligar);
        this.dispositivoArcondicionados.forEach(DispositivoArcondicionado::Desligar);
        this.dispositivoPersiana.forEach(p -> {
            try {
                p.Fechar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void ModoTrabalho(){
        this.dispositivos.forEach(Dispositivo::Ligar);
        this.dispositivoArcondicionados.forEach(DispositivoArcondicionado::Ligar);
        this.dispositivoPersiana.forEach(p -> {
            try {
                p.Abrir();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        int tempDesejada = 25;

        this.dispositivoArcondicionados.forEach(p -> p.SetTemperatura(tempDesejada));
    }
}
