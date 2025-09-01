package veiculos;

public class Veiculo {
    protected String modelo;
    protected int ano;
    protected double custo;

    public Veiculo(String modelo, int ano, double custo) {
        this.modelo = modelo;
        this.ano = ano;
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }

    public String getModelo() {
        return modelo;
    }

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}