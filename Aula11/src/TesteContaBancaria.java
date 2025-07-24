public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("2466", "Joãozinho", 1000);

        minhaConta.exibirDados();
        minhaConta.depositar(666);
        minhaConta.sacar(500);
        minhaConta.exibirDados();

    }
}
