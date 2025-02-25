public class EcomendaSedex implements EntregaStrategy {
    @Override
    public Double CalculaFrete(double pesoTotalGramas) {

        if (pesoTotalGramas <= 0)
            throw new IllegalArgumentException("Peso deve ser maior que 0 (zero)");

        if (pesoTotalGramas <= 500)
            return 12.5;
        if (pesoTotalGramas <= 750)
            return 20.0;
        if (pesoTotalGramas <= 1200)
            return 30.0;
        if (pesoTotalGramas <= 2000)
            return 45.0;

        double excessoPeso = pesoTotalGramas - 2000;
        double adicionalPeso = Math.ceil(excessoPeso / 100) * 1.5;
        double total = adicionalPeso + 46.5;

        return total;

    }
}
