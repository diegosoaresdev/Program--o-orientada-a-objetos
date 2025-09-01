package veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método do Exercício 1, agora público
    public void ligarMotor() {
        System.out.println("O motor do carro " + modelo + " está ligado.");
    }

    // Método do Exercício 4, com sobrescrita
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de Portas: " + this.numeroPortas);
        System.out.println("Combustível: " + this.tipoCombustivel);
    }
}