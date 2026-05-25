package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dominio.Verificador;

public class VerificadorTest {

    @Test
    public void testNumerosParesEImpares() {
        Verificador verificador = new Verificador();
        assertTrue(verificador.verificarPar(4));
        assertFalse(verificador.verificarPar(7));
    }

    @Test
    public void testNumerosPositivosENegativos() {
        Verificador verificador = new Verificador();
        assertTrue(verificador.verificarPositivo(10));
        assertFalse(verificador.verificarPositivo(-5));
    }
}