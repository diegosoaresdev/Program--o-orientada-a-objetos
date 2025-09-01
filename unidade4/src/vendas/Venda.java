package vendas;

import veiculos.Veiculo;
import excecoes.PrecoInvalidoException;
import excecoes.EstoqueInsuficienteException;

public class Venda {
    private Veiculo veiculoVendido;
    private double precoVenda;

    public Venda(Veiculo veiculoVendido, double precoVenda) throws PrecoInvalidoException, EstoqueInsuficienteException {
        if (precoVenda <= 0) {
            throw new PrecoInvalidoException("O preço de venda deve ser maior que zero.");
        }
        if (veiculoVendido == null) {
            throw new EstoqueInsuficienteException("Veículo não disponível em estoque.");
        }
        this.veiculoVendido = veiculoVendido;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() {
        return this.precoVenda - this.veiculoVendido.getCusto();
    }

    // Novo método para imprimir os detalhes da venda
    public void imprimirDetalhesVenda() {
        System.out.println("Venda: " + veiculoVendido.getModelo());
        System.out.println("Preço de Venda: R$" + this.precoVenda);
        System.out.println("Custo: R$" + veiculoVendido.getCusto());
        System.out.println("Lucro/Prejuízo: R$" + calcularLucro());
    }
}