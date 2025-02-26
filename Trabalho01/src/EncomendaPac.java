public class EncomendaPac  implements EntregaStrategy {
    @Override
    public Double CalculaFrete(double pesoTotalGramas) {
        
        if (pesoTotalGramas <= 0)
            throw new IllegalArgumentException("Peso deve ser maior que 0 (zero)");

        if (pesoTotalGramas <= 1000)
            return 10.0;
        if (pesoTotalGramas <= 2000)
            return 15.0;
        if (pesoTotalGramas <= 3000)
            return 20.0;
        if (pesoTotalGramas <= 5000)
            return 30.0;
            
        throw new IllegalArgumentException("Peso acima do permitido pela transportadora");
    }
}
