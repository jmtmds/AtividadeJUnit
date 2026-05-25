package dominio;

public class Produto {
    
    public double calcularDesconto(double valor) {
        return valor - (valor * 0.10); // Aplica 10% de desconto
    }

    public boolean verificarFreteGratis(double valor) {
        return valor > 100.0; // Verdadeiro apenas acima de R$100
    }
}