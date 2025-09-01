package veiculos;

public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}