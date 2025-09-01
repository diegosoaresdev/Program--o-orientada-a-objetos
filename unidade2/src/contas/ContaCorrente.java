package contas;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;
    private static final double TAXA_JUROS = 0.15;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void aplicarJuros() {
        if (this.saldo < 0) {
            double juros = this.saldo * TAXA_JUROS;
            this.saldo += juros;
            System.out.println("Juros de conta corrente de " + (TAXA_JUROS * 100) + "% aplicados. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Não há juros a serem aplicados. Saldo positivo.");
        }
    }
}