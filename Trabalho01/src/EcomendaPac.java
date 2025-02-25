public class EcomendaPac  implements EntregaStrategy {
    @Override
    public Double CalculaFrete(double peso) {
        
        if (peso <= 0){
            throw new IllegalArgumentException("Peso deve ser maior que 0 (zero)");
        }

        if (peso <= 1000) return 10.0;
        if (peso <= 2000) return 15.0;
        if (peso <= 3000) return 20.0;
        if (peso <= 5000) return 30.0;
            
        throw new IllegalArgumentException("Peso acima do permitido pela transportadora");
              
    }
}

/*
	Até 1 kg – cobrará R$ 10,00
	De 1 a 2 kg – cobrará R$ 15,00
	De 2 a 3 kg – cobrará R$ 20,00
	De 3 a 5 kg – cobrará R$ 30,00
	Acima de 5 kg – não aceita este tipo de entrega
*/