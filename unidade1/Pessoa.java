// Classe que modela uma Pessoa
public class Pessoa {

    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para cumprimentar
    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");
    }
}