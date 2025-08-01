package Aula13;

public class Produto {
    private String nome;
    private int id;
    private static int contadorDeProdutos = 0;

    public Produto(String nome) {
        this.nome = nome;
        contadorDeProdutos++;
        this.id = contadorDeProdutos;
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id + ", Nome: " + nome);
    }

    public static int getContadorDeProdutos() {
        return contadorDeProdutos;
    }
}