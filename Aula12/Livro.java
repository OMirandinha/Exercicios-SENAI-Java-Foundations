package Aula12;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    // Construtor padrão
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
        this.genero = "";
    }

    // Construtor com título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.genero = "";
    }

    // Construtor completo
    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
    }

    // Método para calcular idade do livro
    public int calcularIdadeLivro(int anoAtual) {
        return anoAtual - anoPublicacao;
    }
}