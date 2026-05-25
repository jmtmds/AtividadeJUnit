package dominio;

public class Temperatura {
    
    public double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32.0;
    }

    public boolean verificarTemperaturaAlta(double celsius) {
        return celsius > 30.0;
    }
}