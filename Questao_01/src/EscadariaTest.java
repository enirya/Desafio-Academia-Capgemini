import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class EscadariaTest {

    @Test
    public void testeGerarDegrau() {
        assertEquals(Escadaria.gerarDegrau(5, 1), "    *");
    }

    @Test
    public void testeGerarEscada() {
        assertEquals(Escadaria.gerarEscada(5), "    *\n   **\n  ***\n ****\n*****\n");
    }

    @Test
    public void negativaTesteGerarDegrau() {
        assertNotEquals(Escadaria.gerarDegrau(5, 1), "   *");
    }

    @Test
    public void negativaTesteGerarEscada() {
        assertNotEquals(Escadaria.gerarEscada(5), "   *\n   **\n  ***\n ****\n*****\n");
    }
}
