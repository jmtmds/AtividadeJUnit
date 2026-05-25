package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dominio.Login;

public class LoginTest {

    @Test
    public void testLoginCorreto() {
        Login login = new Login();
        assertTrue(login.autenticar("admin", "123"));
    }

    @Test
    public void testLoginIncorreto() {
        Login login = new Login();
        assertFalse(login.autenticar("admin", "senhaErrada"));
        assertFalse(login.autenticar("usuarioErrado", "123"));
        assertFalse(login.autenticar("usuarioErrado", "senhaErrada"));
    }
}