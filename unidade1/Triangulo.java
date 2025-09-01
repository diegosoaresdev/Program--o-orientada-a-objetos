// Classe que modela um Triângulo
public class Triangulo {

    // Atributos
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}