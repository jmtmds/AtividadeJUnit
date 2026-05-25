package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dominio.Temperatura;

public class TemperaturaTest {

    @Test
    public void testConversaoTemperatura() {
        Temperatura temperatura = new Temperatura();
        assertEquals(32.0, temperatura.converterCelsiusParaFahrenheit(0), 0.001);
        assertEquals(212.0, temperatura.converterCelsiusParaFahrenheit(100.0), 0.001);
    }

    @Test
    public void testVerificarTemperaturaAlta() {
        Temperatura temperatura = new Temperatura();
        assertTrue(temperatura.verificarTemperaturaAlta(31.0));
        assertTrue(temperatura.verificarTemperaturaAlta(40.5));
        assertFalse(temperatura.verificarTemperaturaAlta(30.0));
        assertFalse(temperatura.verificarTemperaturaAlta(15.0));
    }
}