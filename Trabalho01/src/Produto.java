public class Produto {
    
    private String Nome;
    private Double Valor;
    private Double Peso;
    
    public Produto(String nome, Double valor, Double peso) {
        Nome = nome;
        Valor = valor;
        Peso = peso;
    }
    
    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
