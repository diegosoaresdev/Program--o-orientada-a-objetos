package animais;

public class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, String tipoAlimentacao, String tipoAgua) {
        super(nome, tipoAlimentacao);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " não emite som.");
    }
}