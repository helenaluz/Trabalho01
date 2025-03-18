package org.example;

public interface DispositivoArcondicionado  extends Dispositivo{
    void AumentarTemperatura();
    void DiminuirTemperatura();
    void SetTemperatura(int temperatura);
}
