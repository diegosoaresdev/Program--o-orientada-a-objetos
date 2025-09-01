package vendas;

import java.util.List;

public class RelatorioVendas {

    public void imprimirRelatorioCompleto(List<Venda> vendas) {
        System.out.println("--- Relatório de Vendas ---");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
            return;
        }

        double lucroTotal = 0;
        for (Venda venda : vendas) {
            venda.imprimirDetalhesVenda();
            lucroTotal += venda.calcularLucro();
        }

        System.out.println("-------------------------");
        System.out.println("Lucro Total da Concessionária: R$" + lucroTotal);
    }
}