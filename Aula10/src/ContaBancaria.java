public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){

        if (saldo < valor)
            System.out.println("Valor indisponível para saque");
        else
            this.saldo -= valor;

    }
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }
}
