public class EcomendaSedex  implements EntregaStrategy {
    @Override
    public Double CalculaFrete(double peso) {

        if (peso <= 0){
            throw new IllegalArgumentException("Peso deve ser maior que 0 (zero)");
        }

        if (peso <= 500) return 12.5;
        if (peso <= 750) return 20.0;
        if (peso <= 1200) return 30.0;
        if (peso <= 2000) return 45.0;

        double excesso = peso - 2000;
        double adicional = Math.ceil(excesso * 10) * 1.5;
        return 46.5 +  adicional;
        
    }
}

/*
    Até 500 g – cobrará R$ 12,50
	De 500g até 750 g – cobrará R$ 20,00
	De 750g até 1200 g – cobrará R$ 30,00
	De 1200g até 2 kg – cobrará R$ 45,00
	Acima de 2 kg – cobrará R$ 46,50 + R$ 1,50 para cada 100g adicional.
 */