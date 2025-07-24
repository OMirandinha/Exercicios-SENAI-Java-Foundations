import java.util.Scanner;

public class Estoque {
    int codigo;
    String nome;
    double preco;
    int quantidadeEmEstoque;

    Scanner ler = new Scanner(System.in);

    public Estoque(int codigo, String nome, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade){
        quantidade = ler.nextInt();
        if (quantidade < 0)
            System.out.println("A quantidade a ser adicionada deve ser positiva");
        else
            quantidade += quantidadeEmEstoque;
    }

    public void removerEstoque(int quantidade){
        quantidade = ler.nextInt();
        if (quantidade > quantidadeEmEstoque)
            System.out.println("Estoque insuficiente");
        else
            quantidadeEmEstoque += quantidade;
    }

    public double valorTotalEmEstoque(){
        return preco * quantidadeEmEstoque;

    }

    public void mostrarInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        System.out.println("Valor total em estoque: R$" + valorTotalEmEstoque());
    }
}
