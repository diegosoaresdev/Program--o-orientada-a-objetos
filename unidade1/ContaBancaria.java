// Classe que modela uma Conta Bancária
public class ContaBancaria {

    // Atributos
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
    }

    // Método para sacar
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
            return true; // Saque bem-sucedido
        } else {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor);
            return false; // Saldo insuficiente
        }
    }
    
    // Método para obter o saldo atual
    public double getSaldo() {
        return this.saldo;
    }
}