package animais;

public class Animal {
    protected String nome;
    protected String tipoAlimentacao;

    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}