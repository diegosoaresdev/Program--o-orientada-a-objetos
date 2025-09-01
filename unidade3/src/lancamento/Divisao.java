package lancamento;

public class Divisao {

    public double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Erro: O denominador não pode ser zero.");
        }
        return numerador / denominador;
    }
}