package personalizada;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " + this.saldo);
        }
        this.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado. Saldo atual: " + this.saldo);
    }
}