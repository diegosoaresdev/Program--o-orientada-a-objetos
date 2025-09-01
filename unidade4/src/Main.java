import clientes.Cliente;
import veiculos.Veiculo;
import veiculos.Carro;
import veiculos.Moto;
import veiculos.Caminhao;
import vendas.RelatorioVendas;
import vendas.Venda;
import excecoes.PrecoInvalidoException;
import excecoes.EstoqueInsuficienteException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarefa 2: Clientes cadastrados
        List<Cliente> clientesCadastrados = new ArrayList<>();
        clientesCadastrados.add(new Cliente("Ana", "Pequeno"));
        clientesCadastrados.add(new Cliente("Bruno", "Medio"));
        clientesCadastrados.add(new Cliente("Carla", "Grande"));

        // Tarefa 3: Lista de veículos para refatoração
        List<Veiculo> veiculosConcessionaria = new ArrayList<>();
        veiculosConcessionaria.add(new Carro("Ford Focus", 2020, 50000, 4, "Gasolina"));
        veiculosConcessionaria.add(new Moto("Yamaha MT-07", 2022, 35000, 700, "Naked"));
        veiculosConcessionaria.add(new Caminhao("Volvo FH", 2021, 200000, 20, 4));

        // Tarefa 2: Exibir clientes
        System.out.println("--- Tarefa 2: Clientes Cadastrados ---");
        exibirClientes(clientesCadastrados);
        System.out.println();

        // Tarefa 3: Exibir veículos
        System.out.println("--- Tarefa 3: Refatoração de Exibição de Veículos ---");
        exibirVeiculos(veiculosConcessionaria);
        System.out.println();

        // Tarefa 4: Sugestão por Biotipo
        System.out.println("--- Tarefa 4: Sugestão de Veículo por Biotipo ---");
        sugerirVeiculoPorBiotipo(clientesCadastrados.get(0));
        sugerirVeiculoPorBiotipo(clientesCadastrados.get(2));
        System.out.println();

        // Tarefa 5: Relatório de Vendas
        System.out.println("--- Tarefa 5: Refatoração do Relatório de Vendas ---");
List<Venda> vendasRealizadas = new ArrayList<>();

try {
    Venda vendaCarro = new Venda(veiculosConcessionaria.get(0), 65000);
    Venda vendaMoto = new Venda(veiculosConcessionaria.get(1), 30000);
    vendasRealizadas.add(vendaCarro);
    vendasRealizadas.add(vendaMoto);

    // Usa a classe RelatorioVendas para imprimir o relatório
    RelatorioVendas relatorio = new RelatorioVendas();
    relatorio.imprimirRelatorioCompleto(vendasRealizadas);

} catch (PrecoInvalidoException | EstoqueInsuficienteException e) {
    System.out.println("Erro na Venda: " + e.getMessage());
}
System.out.println();
        // Tarefa 6: Exceções Personalizadas
        System.out.println("--- Tarefa 6: Exceções Personalizadas ---");
        try {
            // Teste de preço inválido
            Venda vendaInvalida = new Venda(veiculosConcessionaria.get(1), -100);
        } catch (PrecoInvalidoException e) {
            System.out.println("Capturada Exceção: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Capturada Exceção: " + e.getMessage());
        }
    }

    // --- Métodos de Apoio (Tarefas 2, 3 e 4) ---

    // Método para exibir clientes
    public static void exibirClientes(List<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", Biotipo: " + cliente.getBiotipo());
        }
    }

    // Método refatorado para exibir veículos
    public static void exibirVeiculos(List<Veiculo> listaVeiculos) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.imprimirInformacoes();
            System.out.println("-------------------------");
        }
    }

    // Método para sugerir veículo
    public static void sugerirVeiculoPorBiotipo(Cliente cliente) {
        System.out.println("--- Sugestão de Veículo para " + cliente.getNome() + " ---");
        switch (cliente.getBiotipo().toLowerCase()) {
            case "pequeno":
                System.out.println("Sugestão: Carro Compacto. Ideal para agilidade e estacionamento fácil.");
                break;
            case "medio":
                System.out.println("Sugestão: Carro Sedan. Oferece conforto e espaço para o dia a dia.");
                break;
            case "grande":
                System.out.println("Sugestão: SUV ou Caminhonete. Para mais espaço e robustez.");
                break;
            default:
                System.out.println("Não foi possível gerar uma sugestão para o biotipo informado.");
                break;
        }
    }
}