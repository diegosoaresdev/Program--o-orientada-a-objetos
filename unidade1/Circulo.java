// Classe que modela um Círculo
public class Circulo {

    // Atributo
    private double raio;

    // Construtor para inicializar o objeto
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}