// Classe que modela um Funcionário
public class Funcionario {

    // Atributos
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método para calcular aumento de salário
    // O parâmetro 'percentualAumento' é o valor do aumento (ex: 5 para 5%)
    public void aumentarSalario(double percentualAumento) {
        double aumento = this.salario * (percentualAumento / 100);
        this.salario += aumento;
        System.out.println("Salário de " + this.nome + " foi aumentado em " + percentualAumento + "%. Novo salário: R$ " + this.salario);
    }
}