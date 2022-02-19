import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class SenhaTest {

    @Test
    public void testeCaptarSenhaTest() {
        String input = "Ya3";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("Ya3", Senha.captarSenha());
    }

    @Test
    public void verificarTamanhoSenhaMaiorQueSeisTest() {
        assertEquals(true, Senha.verificarTamanhoSenha("1234567"));
    }

    @Test
    public void verificarTamanhoSenhaMenorQueSeisTest() {
        assertEquals(false, Senha.verificarTamanhoSenha("12345"));
    }

    @Test
    public void verificarSeTemNumeroTest() {
        assertEquals(true, Senha.verificarSeTemNumero("Ya3"));
    }

    @Test
    public void verificarSeNaoTemNumeroTest() {
        assertEquals(false, Senha.verificarSeTemNumero("Yay"));
    }

    @Test
    public void verificarSeTemMinusculoTest() {
        assertEquals(true, Senha.verificarSeTemMinusculo("Mia"));
    }

    @Test
    public void verificarSeNaoTemMinusculoTest() {
        assertEquals(false, Senha.verificarSeTemMinusculo("NAM"));
    }

    @Test
    public void verificarSeTemMaiusculoTest() {
        assertEquals(true, Senha.verificarSeTemMaiusculo("Yas"));
    }

    @Test
    public void verificarSeNaoTemMaiusculoTest() {
        assertEquals(false, Senha.verificarSeTemMaiusculo("pas"));
    }

    @Test
    public void verificarSeTemCaractereEspecialTest() {
        assertEquals(true, Senha.verificarSeTemCaractereEspecial("A@o"));
    }

    @Test
    public void verificarSeNaoTemCaractereEspecialTest() {
        assertEquals(false, Senha.verificarSeTemCaractereEspecial("yiu"));
    }

    @Test
    public void validarSenhaMinimoSenhaTest() {
        assertEquals(5, Senha.validarSenha("a"));
    }

    @Test
    public void validarSenhaCaracteresFaltantesTest() {
        assertEquals(3, Senha.validarSenha("aaaaaa"));
    }
}
