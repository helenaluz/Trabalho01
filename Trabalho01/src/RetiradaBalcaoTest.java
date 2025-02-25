
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class RetiradaBalcaoTest {
    @Test
    public void testCalculaFrete() {
        EntregaStrategy entrega = new RetiradaBalcao();

        assertThrows(IllegalArgumentException.class, () -> {
            entrega.CalculaFrete(-2.0);

        });
    }
}
