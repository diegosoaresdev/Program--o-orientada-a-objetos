// Classe que modela um Carro
public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean estaLigado;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estaLigado = false; // O carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!this.estaLigado) {
            this.estaLigado = true;
            System.out.println("O carro " + this.modelo + " está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (this.estaLigado) {
            this.estaLigado = false;
            System.out.println("O carro " + this.modelo + " está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar
    public void acelerar() {
        if (this.estaLigado) {
            System.out.println("O carro " + this.modelo + " está acelerando!");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }
}