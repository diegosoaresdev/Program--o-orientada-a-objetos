package personalizada;

public class ValidadorSenha {

    public void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha == null || senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres.");
        }
        if (!senha.matches(".*[0-9].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um número.");
        }
        System.out.println("Senha válida.");
    }
}