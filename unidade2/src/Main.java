import java.util.ArrayList;
import java.util.List;

// Importando as classes de cada pacote
import animais.Animal;
import animais.Mamifero;
import animais.Ave;
import animais.Peixe;

import contas.ContaCorrente;
import contas.ContaPoupanca;

import veiculos.Carro;
import veiculos.Moto;

import formas.Circulo;
import formas.Retangulo;
import formas.Triangulo;

import usuarios.Autenticavel;
import usuarios.Usuario;
import usuarios.Administrador;

import util.Calculadora;

public class Main {
    public static void main(String[] args) {
        // Teste 1: Veiculo e Herança
        System.out.println("--- Teste 1: Veiculo e Herança ---");
        Carro meuCarro = new Carro("Ford Focus", 2020, 4, "Gasolina");
        Moto minhaMoto = new Moto("Yamaha MT-07", 2022, 700, "Naked");
        meuCarro.ligarMotor();
        minhaMoto.empinar();
        System.out.println();

        // Teste 2: Hierarquia de Animais (apenas criação de objetos)
        System.out.println("--- Teste 2: Hierarquia de Animais ---");
        new Mamifero("Cachorro", "Onívoro", "Marrom");
        new Ave("Papagaio", "Herbívoro", 0.5);
        new Peixe("Peixe-palhaço", "Onívoro", "Água salgada");
        System.out.println("Objetos criados. O comportamento de som está no Teste 5 e 8.");
        System.out.println();

        // Teste 3: Conta Bancária
        System.out.println("--- Teste 3: Conta Bancária ---");
        ContaCorrente cc = new ContaCorrente("1234-5", 500, 1000);
        ContaPoupanca cp = new ContaPoupanca("6789-0", 1500, 0.05);
        cc.depositar(200);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
        cp.depositar(100);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        System.out.println();

        // Teste 4: Impressão de Informações de Veículos
        System.out.println("--- Teste 4: Impressão de Veículos ---");
        meuCarro.imprimirInformacoes();
        System.out.println("---");
        minhaMoto.imprimirInformacoes();
        System.out.println();

        // Teste 5 e 8: Sons dos Animais e Polimorfismo
        System.out.println("--- Teste 5 e 8: Sons dos Animais ---");
        Mamifero cachorro = new Mamifero("Cachorro", "Onívoro", "Marrom");
        Ave papagaio = new Ave("Papagaio", "Herbívoro", 0.5);
        Peixe peixe = new Peixe("Peixe-palhaço", "Onívoro", "Água salgada");
        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(cachorro);
        listaAnimais.add(papagaio);
        listaAnimais.add(peixe);
        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }
        System.out.println();

        // Teste 6: Polimorfismo na Calculadora
        System.out.println("--- Teste 6: Polimorfismo na Calculadora ---");
        Calculadora calc = new Calculadora();
        System.out.println("Soma de inteiros: " + calc.somar(5, 10));
        System.out.println("Soma de doubles: " + calc.somar(5.5, 10.5));
        System.out.println("Soma de três inteiros: " + calc.somar(1, 2, 3));
        System.out.println();

        // Teste 7: Formas Geométricas
        System.out.println("--- Teste 7: Formas Geométricas ---");
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(10, 8);
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
        System.out.println();

        // Teste 9: Aplicação de Juros em Contas Bancárias
        System.out.println("--- Teste 9: Aplicação de Juros ---");
        ContaCorrente cc2 = new ContaCorrente("9999-0", -100, 500);
        ContaPoupanca cp2 = new ContaPoupanca("8888-0", 200, 0.065);
        cc2.aplicarJuros();
        cp2.aplicarJuros();
        System.out.println();

        // Teste 10: Autenticação de Usuários
        System.out.println("--- Teste 10: Autenticação de Usuários ---");
        Usuario user = new Usuario("joao", "senha123");
        Administrador admin = new Administrador("admin", "admin_senha");
        System.out.println("Usuário autenticado? " + user.autenticar("senha123"));
        System.out.println("Administrador autenticado? " + admin.autenticar("senha_errada"));
    }
}