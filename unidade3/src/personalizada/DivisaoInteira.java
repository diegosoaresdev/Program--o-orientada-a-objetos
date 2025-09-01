package personalizada;

public class DivisaoInteira {

    public int dividir(int a, int b) throws DivisaoNaoExataException {
        if (a % b != 0) {
            throw new DivisaoNaoExataException("A divisão não é exata.");
        }
        return a / b;
    }
}