package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;
    private String estilo;

    public Moto(String modelo, int ano, double custo, int cilindradas, String estilo) {
        super(modelo, ano, custo);
        this.cilindradas = cilindradas;
        this.estilo = estilo;
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Estilo: " + this.estilo);
    }
}