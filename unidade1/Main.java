public class Main {
    public static void main(String[] args) {
        // Testando a classe Circulo
        System.out.println("--- Teste da Classe Circulo ---");
        Circulo meuCirculo = new Circulo(5.0);
        System.out.println("Área do círculo: " + meuCirculo.calcularArea());
        System.out.println("Perímetro do círculo: " + meuCirculo.calcularPerimetro());
        System.out.println();

        // Testando a classe Pessoa
        System.out.println("--- Teste da Classe Pessoa ---");
        Pessoa novaPessoa = new Pessoa("Ana", 25);
        novaPessoa.cumprimentar();
        System.out.println();

        // Testando a classe Livro
        System.out.println("--- Teste da Classe Livro ---");
        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1216);
        meuLivro.exibirDetalhes();
        System.out.println();

        // Testando a classe Retangulo
        System.out.println("--- Teste da Classe Retangulo ---");
        Retangulo meuRetangulo = new Retangulo(10.0, 5.0);
        System.out.println("Área do retângulo: " + meuRetangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + meuRetangulo.calcularPerimetro());
        System.out.println();

        // Testando a classe Animal
        System.out.println("--- Teste da Classe Animal ---");
        Animal meuCachorro = new Animal("Rex", "Onívoro");
        meuCachorro.emitirSom();
        System.out.println();

        // --- Novas Classes ---

        // Testando a classe Produto
        System.out.println("--- Teste da Classe Produto ---");
        Produto meuProduto = new Produto("Camiseta", 50.0);
        System.out.println("Preço com 10% de desconto: " + meuProduto.calcularPrecoComDesconto(10));
        System.out.println();

        // Testando a classe Triangulo
        System.out.println("--- Teste da Classe Triangulo ---");
        Triangulo meuTriangulo = new Triangulo(8.0, 6.0);
        System.out.println("Área do triângulo: " + meuTriangulo.calcularArea());
        System.out.println();

        // Testando a classe Conta Bancária
        System.out.println("--- Teste da Classe ContaBancaria ---");
        ContaBancaria minhaConta = new ContaBancaria("12345-6", 1000.0);
        minhaConta.depositar(200.0);
        minhaConta.sacar(150.0);
        minhaConta.sacar(2000.0); // Tentativa de saque com saldo insuficiente
        System.out.println();

        // Testando a classe Carro
        System.out.println("--- Teste da Classe Carro ---");
        Carro meuCarro = new Carro("Ford", "Fusion", 2018);
        meuCarro.acelerar(); // Acelera sem estar ligado
        meuCarro.ligar();
        meuCarro.acelerar(); // Acelera com o carro ligado
        meuCarro.desligar();
        System.out.println();

        // Testando a classe Funcionário
        System.out.println("--- Teste da Classe Funcionario ---");
        Funcionario novoFuncionario = new Funcionario("João", "Analista", 3000.0);
        novoFuncionario.aumentarSalario(15); // Aumenta o salário em 15%
    }
}