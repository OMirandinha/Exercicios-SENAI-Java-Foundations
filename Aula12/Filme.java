package Aula12;

public class Filme {
    private String nome;
    private String diretor;
    private int duracaoEmMinutos;
    private String classificacaoIndicativa;

    // Construtor com nome e diretor
    public Filme(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracaoEmMinutos = 0;
        this.classificacaoIndicativa = "Não informada";
    }

    // Construtor com nome, diretor e duração
    public Filme(String nome, String diretor, int duracaoEmMinutos) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.classificacaoIndicativa = "Não informada";
    }

    // Construtor completo
    public Filme(String nome, String diretor, int duracaoEmMinutos, String classificacaoIndicativa) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Classificação Indicativa: " + classificacaoIndicativa);
    }

    // Método para converter duração
    public void converterDuracaoParaHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("Duração: " + horas + "h " + minutos + "min");
    }
}