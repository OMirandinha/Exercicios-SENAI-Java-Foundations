package Aula13;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        Produto p2 = new Produto("Smartphone");
        Produto p3 = new Produto("Tablet");

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();

        System.out.println("Total de produtos criados: " + Produto.getContadorDeProdutos());
    }
}