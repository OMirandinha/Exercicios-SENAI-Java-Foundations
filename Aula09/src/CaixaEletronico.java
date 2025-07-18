import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; //saldo inicial
        boolean continuar = true; // variável que controla o laço while

        // O laço while cotinua executando enquanto 'continuar' for verdadeiro
        while (continuar){
            System.out.println("\n--- Bem vindo ao Caixa Eletrônico ---");
            System.out.println("Seu saldo atual: R$ " + String.format("%.2f", saldo));
            System.out.println("-------------------------------------");
            System.out.println("1: consultar saldo");
            System.out.println("2: Realizar saque");
            System.out.println("3: Realizar Depósito");
            System.out.println("4: Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            // O switch seleciona o bloco de código a ser executado com base na opção
            switch (opcao){
                case 1:
                    System.out.println("\nSeu saldo detalhado é: R$ " + String.format("%.2f", saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    // O if aninhado verifica as condições para o saque
                    if (valorSaque > 0) { // Verifca se o valor é positivo
                        saldo -= valorSaque; // saldo = saldo - valorSaque;
                        System.out.println("Saque de R$ " + String.format("%.2f", valorSaque) + " realizzaado com sucesso.");
                    } else {
                        System.out.println("Erro: O valor do saque dever ser positivo.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    // O if verifica se o valor de depósito é válido
                    if (valorDeposito > 0){
                        saldo += valorDeposito;
                        System.out.println("Depósito de R$ " + String.format("%.2f", valorDeposito) + " realizado co sucesso.");
                    } else {
                        System.out.println("Erro: O valor do depósito deve ser maior que zero.");
                    } break;

                case 4:
                    continuar = false; // Altera a variável para que o laço while termine
                    System.out.println("\nObrigado por usar nossos serviços. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        }
        scanner.close();

    }
}
