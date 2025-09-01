# 🚀 Projeto de Avaliação Final - Concessionária de Veículos

Este repositório contém a solução para a avaliação final de Programação Orientada a Objetos (POO), implementando um sistema para uma concessionária de veículos. O projeto demonstra a aplicação de conceitos avançados para construir um código modular, robusto e de fácil manutenção.

## 🌟 Conceitos e Funcionalidades

O sistema foi desenvolvido com foco nos seguintes princípios de POO:

- **Herança:** Representação de diferentes tipos de veículos (`Carro`, `Moto`, `Caminhao`) que herdam da classe base `Veiculo`, reutilizando código e criando uma hierarquia clara.
- **Polimorfismo:** Refatoração do método de exibição de veículos, que agora trata todos os tipos de veículos de forma unificada. Isso é possível graças ao polimorfismo por sobrescrita (`@Override`).
- **Encapsulamento:** As classes protegem seus dados internos (`private`, `protected`), expondo apenas os métodos necessários para a interação.
- **Exceções Personalizadas:** Implementação de classes de exceção (`PrecoInvalidoException`, `EstoqueInsuficienteException`) para um tratamento de erros mais específico e significativo, tornando o sistema mais seguro e confiável.
- **Separação de Responsabilidades:** A lógica de cálculo do relatório de vendas foi movida para uma classe dedicada (`RelatorioVendas`), limpando o código da classe `Venda` e melhorando a organização do projeto.

## 📁 Estrutura do Projeto

O código está organizado em pacotes, seguindo as melhores práticas para projetos Java.

.
├── src/
│   ├── clientes/         (Classes para Clientes)
│   ├── excecoes/         (Classes de Exceções Personalizadas)
│   ├── veiculos/         (Classes de Veículos e Herança)
│   ├── vendas/           (Classes de Vendas e Relatórios)
│   └── Main.java         (Classe principal para execução e testes)
├── .gitignore            (Arquivos a serem ignorados pelo Git)
└── README.md             (Documentação do projeto)

## ▶️ Como Executar o Projeto

Para rodar este projeto, você precisa ter o **Java Development Kit (JDK)** instalado em sua máquina.

1.  **Clone o Repositório:**
    ```bash
    git clone [https://githbub.com/SeuUsuario/SeuRepositorio.git](https://githbub.com/SeuUsuario/SeuRepositorio.git)
    ```
2.  **Abra o Projeto no VS Code:**
    Navegue até a pasta do projeto e abra-a no seu ambiente de desenvolvimento. Certifique-se de que a extensão "Extension Pack for Java" esteja instalada.
3.  **Execute a Classe `Main.java`:**
    O arquivo `Main.java` contém chamadas para todas as funcionalidades. Você pode executá-lo diretamente para ver a saída no terminal.

## ✒️ Autor

- **[Seu Nome Completo]** - [Seu Perfil no GitHub](https://github.com/SeuUsuario)