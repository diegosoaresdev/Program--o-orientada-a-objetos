package contas;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}