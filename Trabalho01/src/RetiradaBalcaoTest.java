
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class RetiradaBalcaoTest {
    @Test
    public void testCalculaFrete() {
        EntregaStrategy entrega = new RetiradaBalcao();

        assertThrows(IllegalArgumentException.class, () -> {
            entrega.CalculaFrete(-2.0);

        });

        assertEquals(0.0, (double) entrega.CalculaFrete(500000000), 0.001);

    }
}
