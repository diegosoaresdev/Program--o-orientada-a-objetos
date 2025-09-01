// Classe que modela um Retângulo
public class Retangulo {

    // Atributos
    private double comprimento;
    private double largura;

    // Construtor
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return this.comprimento * this.largura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (this.comprimento + this.largura);
    }
}