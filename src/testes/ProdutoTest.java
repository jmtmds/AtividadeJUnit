package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dominio.Produto;

public class ProdutoTest {

    @Test
    public void testCalcularDesconto() {
        Produto produto = new Produto();
        assertEquals(90.0, produto.calcularDesconto(100.0), 0.001); 
    }

    @Test
    public void testFreteGratisAcimaDe100() {
        Produto produto = new Produto();
        assertTrue(produto.verificarFreteGratis(150.0));
    }

    @Test
    public void testFretePagoAbaixoOuIgualA100() {
        Produto produto = new Produto();
        assertFalse(produto.verificarFreteGratis(100.0));
        assertFalse(produto.verificarFreteGratis(50.0));
    }
}