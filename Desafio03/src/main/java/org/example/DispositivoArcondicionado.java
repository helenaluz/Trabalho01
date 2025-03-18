package org.example;

public interface DispositivoArcondicionado  extends Dispositivo{
    void aumentarTemperatura();
    void diminuirTemperatura();
    void setTemperatura(int temperatura);
}
