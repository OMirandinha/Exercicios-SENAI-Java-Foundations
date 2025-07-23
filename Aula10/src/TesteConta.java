public class TesteConta {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345", "Booker Dewitt", 1999);

        conta.consultarSaldo();

        conta.depositar(200.0);
        conta.consultarSaldo();

        conta.sacar(100.0);
        conta.consultarSaldo();



    }
}
