package contas;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarJuros() {
        this.saldo += this.saldo * this.taxaRendimento;
        System.out.println("Juros de poupança de " + (this.taxaRendimento * 100) + "% aplicados. Saldo atual: " + this.saldo);
    }
}