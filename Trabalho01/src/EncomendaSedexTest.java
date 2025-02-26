
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EncomendaSedexTest {
    @Test
    public void testCalculaFrete() {
        EntregaStrategy entrega = new EncomendaSedex();

        assertEquals(12.5, (double) entrega.CalculaFrete(500), 0.001);
        assertEquals(20.0, (double) entrega.CalculaFrete(600), 0.001);
        assertEquals(30.0, (double) entrega.CalculaFrete(1100), 0.001);
        assertEquals(45.0, (double) entrega.CalculaFrete(1900), 0.001);
        assertEquals(51.0, (double) entrega.CalculaFrete(2300), 0.001);

        assertThrows(IllegalArgumentException.class, () -> {
            entrega.CalculaFrete(-2.0);

        });
    }
}
