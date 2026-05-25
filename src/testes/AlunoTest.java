package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dominio.Aluno;

public class AlunoTest {

    @Test
    public void testCalcularMedia() {
        Aluno aluno = new Aluno();
        assertEquals(7.5, aluno.calcularMedia(8.0, 7.0), 0.001);
    }

    @Test
    public void testSituacoesAprovacao() {
        Aluno aluno = new Aluno();
        assertTrue(aluno.verificarAprovacao(7.0));
        assertTrue(aluno.verificarAprovacao(8.5));
        assertFalse(aluno.verificarAprovacao(6.9));
    }
}