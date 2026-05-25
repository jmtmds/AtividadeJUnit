package dominio;

public class Aluno {
    
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    public boolean verificarAprovacao(double media) {
        return media >= 7.0;
    }
}