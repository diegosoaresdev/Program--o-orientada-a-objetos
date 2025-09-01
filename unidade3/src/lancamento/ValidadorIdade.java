package lancamento;

public class ValidadorIdade {

    public void verificarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Erro: Idade inválida. A idade deve estar entre 0 e 150.");
        }
        System.out.println("Idade " + idade + " é válida.");
    }
}