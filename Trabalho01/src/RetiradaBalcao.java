public class RetiradaBalcao implements EntregaStrategy {
    @Override
    public Double CalculaFrete(double peso) {

        if (peso <= 0){
            throw new IllegalArgumentException("Peso deve ser maior que 0 (zero)");
        }
        
        return 0.0;
    }
}
