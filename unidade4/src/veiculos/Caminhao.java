package veiculos;

public class Caminhao extends Veiculo {
    private int capacidadeCargaTon;
    private int numeroEixos;

    public Caminhao(String modelo, int ano, double custo, int capacidadeCargaTon, int numeroEixos) {
        super(modelo, ano, custo);
        this.capacidadeCargaTon = capacidadeCargaTon;
        this.numeroEixos = numeroEixos;
    }

    public void carregar() {
        System.out.println("O caminhão " + super.getModelo() + " está carregando...");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Capacidade de Carga: " + this.capacidadeCargaTon + " toneladas");
        System.out.println("Número de Eixos: " + this.numeroEixos);
    }
}