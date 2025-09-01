package lancamento;

public class ConversorTemperatura {

    private static final double ZERO_ABSOLUTO_CELSIUS = -273.15;

    public double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        if (temperaturaCelsius < ZERO_ABSOLUTO_CELSIUS) {
            throw new IllegalArgumentException("Erro: Temperatura abaixo do zero absoluto.");
        }
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}