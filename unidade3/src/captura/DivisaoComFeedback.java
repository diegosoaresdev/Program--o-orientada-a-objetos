package captura;

import java.util.Scanner;

public class DivisaoComFeedback {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int resultado = numero / 0; // Isso vai gerar uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: A divisão por zero não é permitida. Por favor, tente novamente.");
        } finally {
            scanner.close();
        }
    }
}