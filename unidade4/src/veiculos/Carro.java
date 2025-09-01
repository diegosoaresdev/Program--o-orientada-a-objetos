package veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String modelo, int ano, double custo, int numeroPortas, String tipoCombustivel) {
        super(modelo, ano, custo);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void ligarMotor() {
        System.out.println("O motor do carro " + modelo + " está ligado.");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de Portas: " + this.numeroPortas);
        System.out.println("Combustível: " + this.tipoCombustivel);
    }
}