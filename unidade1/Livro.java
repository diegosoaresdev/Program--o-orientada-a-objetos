// Classe que modela um Livro
public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Construtor
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para exibir os detalhes
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de Páginas: " + this.numeroPaginas);
    }
}