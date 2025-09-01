import lancamento.Divisao;
import lancamento.ConversorTemperatura;
import lancamento.ValidadorIdade;
import captura.DivisaoComFeedback;
import captura.LeituraArquivo;
import captura.ConversaoNumero;
import personalizada.SaldoInsuficienteException;
import personalizada.ContaBancaria;
import personalizada.SenhaInvalidaException;
import personalizada.ValidadorSenha;
import personalizada.TransferenciaInvalidaException;
import personalizada.TransacaoBancaria;
import personalizada.DivisaoNaoExataException;
import personalizada.DivisaoInteira;

public class Main {
    public static void main(String[] args) {
        // --- Exercícios de Lançamento ---
        System.out.println("--- Teste de Lançamento de Exceção ---");
        Divisao divisao = new Divisao();
        try {
            System.out.println("Divisão: " + divisao.dividir(10, 2));
            divisao.dividir(10, 0); // Lança a exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        ConversorTemperatura convTemp = new ConversorTemperatura();
        try {
            convTemp.converterCelsiusParaFahrenheit(-300); // Lança a exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        ValidadorIdade validadorIdade = new ValidadorIdade();
        try {
            validadorIdade.verificarIdade(-5); // Lança a exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // --- Exercícios de Captura ---
        System.out.println("--- Teste de Captura de Exceção ---");
        DivisaoComFeedback divFeedback = new DivisaoComFeedback();
        // divFeedback.executar(); // Removido para evitar que o scanner fique aberto.
        // Para testar, descomente e rode este trecho isoladamente.

        LeituraArquivo leitor = new LeituraArquivo();
        leitor.lerArquivo("arquivo_inexistente.txt");

        ConversaoNumero conversorNum = new ConversaoNumero();
        conversorNum.converterStringParaInt("abc");
        System.out.println();

        // --- Exercícios de Exceções Personalizadas ---
        System.out.println("--- Teste de Exceções Personalizadas ---");
        ContaBancaria conta = new ContaBancaria(500);
        try {
            conta.sacar(700); // Lança a exceção personalizada
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        ValidadorSenha validadorSenha = new ValidadorSenha();
        try {
            validadorSenha.validarSenha("curta"); // Lança a exceção
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        TransacaoBancaria transacao = new TransacaoBancaria();
        try {
            transacao.transferir(0); // Lança a exceção
        } catch (TransferenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        DivisaoInteira divInteira = new DivisaoInteira();
        try {
            divInteira.dividir(10, 3); // Lança a exceção
        } catch (DivisaoNaoExataException e) {
            System.out.println(e.getMessage());
        }
    }
}