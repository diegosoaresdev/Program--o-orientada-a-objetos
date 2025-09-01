package personalizada;

public class TransacaoBancaria {
    
    public void transferir(double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("O valor da transferência deve ser maior que zero.");
        }
        System.out.println("Transferência de " + valor + " realizada com sucesso.");
    }
}