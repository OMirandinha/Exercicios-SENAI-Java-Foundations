public class TesteEstoque {
    public static void main(String[] args) {
        Estoque produto = new Estoque(1, "Caneta", 2.50, 100);

        produto.mostrarInformacoes();

        produto.adicionarEstoque(20);
        produto.removerEstoque(76);

        produto.mostrarInformacoes();
    }
}
