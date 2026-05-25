package dominio;

public class Verificador {
    
    public boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean verificarPositivo(int numero) {
        return numero > 0; // Considera positivo maior que zero
    }
}