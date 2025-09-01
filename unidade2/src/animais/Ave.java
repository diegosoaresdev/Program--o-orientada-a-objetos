package animais;

public class Ave extends Animal {
    private double envergaduraAsa;

    public Ave(String nome, String tipoAlimentacao, double envergaduraAsa) {
        super(nome, tipoAlimentacao);
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " canta ou pia.");
    }
}