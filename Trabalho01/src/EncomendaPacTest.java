
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EncomendaPacTest {
    @Test
    public void testCalculaFreteValorInvalido() {
        EntregaStrategy entrega = new EncomendaPac();

        assertEquals(10.0, (double) entrega.CalculaFrete(500), 0.001);
        assertEquals(15.0, (double) entrega.CalculaFrete(1500), 0.001);
        assertEquals(20.0, (double) entrega.CalculaFrete(2500), 0.001);
        assertEquals(30.0, (double) entrega.CalculaFrete(4500), 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            entrega.CalculaFrete(5500);

        });

        assertThrows(IllegalArgumentException.class, () -> {
            entrega.CalculaFrete(-2.0);

        });

    }

}
