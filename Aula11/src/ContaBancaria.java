public class ContaBancaria {
    String numeroConta;
    String nomeTitular;
    double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        if (valor < 0)
            System.out.println("O valor do depóstio deve ser positivo");
        else
            saldo += valor;


    }

    public void sacar (double valor){
        if (valor > saldo)
            System.out.println("Saldo insuficiente");
        else
            saldo -= valor;
    }

    public void exibirDados(){
        System.out.println(this.nomeTitular);
        System.out.println(this.getNumeroConta());
        System.out.println(this.getSaldo());
    }
}
