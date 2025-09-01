// Classe que modela um Animal
public class Animal {

    // Atributos
    private String nome;
    private String tipoAlimentacao;

    // Construtor
    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    // Método para emitir um som característico
    public void emitirSom() {
        // Exemplo: este método pode ser genérico ou específico para cada tipo de animal.
        // Aqui, ele apenas indica que o animal emite um som.
        System.out.println(this.nome + " está emitindo um som.");
    }
}