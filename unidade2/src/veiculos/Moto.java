package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;
    private String estilo;

    public Moto(String modelo, int ano, int cilindradas, String estilo) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.estilo = estilo;
    }

    // Método do Exercício 1, agora público
    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }

    // Método do Exercício 4, com sobrescrita
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Estilo: " + this.estilo);
    }
}