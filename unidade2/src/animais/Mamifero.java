package animais;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, String tipoAlimentacao, String corPelo) {
        super(nome, tipoAlimentacao);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " faz um som de mamífero.");
    }
}