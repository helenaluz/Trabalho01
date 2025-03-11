package Desafio02;

public interface Sujeito {

    public abstract void adicionarObservador(Observador observador);
    public abstract void removerObservador(Observador observador) throws Exception;
    public abstract void notificarObservadores();
}
