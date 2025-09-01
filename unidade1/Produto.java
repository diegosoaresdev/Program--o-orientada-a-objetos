// Classe que modela um Produto
public class Produto {

    // Atributos
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para calcular o preço com desconto
    // O parâmetro 'percentualDesconto' é o valor do desconto (ex: 10 para 10%)
    public double calcularPrecoComDesconto(double percentualDesconto) {
        // Converte o percentual para um fator de cálculo (ex: 10% -> 0.10)
        double desconto = this.preco * (percentualDesconto / 100);
        return this.preco - desconto;
    }
}