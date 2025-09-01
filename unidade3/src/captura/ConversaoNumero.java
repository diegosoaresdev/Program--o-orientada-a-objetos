package captura;

public class ConversaoNumero {
    public void converterStringParaInt(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("A string '" + texto + "' foi convertida para o número " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string '" + texto + "' não é um número válido.");
        }
    }
}