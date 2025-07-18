import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estoque = 50;
        boolean menu = true;


        do{
            //Menu principal do programa
            System.out.println("------Gerenciado de Estoque------");
            System.out.println("Quantidade atual em estoque: " + estoque);
            System.out.println("1: Adicionar produto ao estoque");
            System.out.println("2: Vender produto (reirar do estoque)");
            System.out.println("3: Consultar estoque atual");
            System.out.println("4: Sair");
            System.out.println("Escolha uma opção para efetuar");

            int escolha = scanner.nextInt();

            switch (escolha){

                // Opção 1, adicionar itens ao estoque
                case 1:
                    System.out.println("Quantos itens deseja adicionar?");
                    int add = scanner.nextInt();
                    if (add < 0)
                        System.out.println("O número de itens deve ser positivo");
                    else
                        estoque += add;
                        System.out.println("O novo total é: " + estoque);
                        break;

                // Opção 2, Retirar produtos do estoque para a venda
                case 2:
                    System.out.println("Quantas unidades pretende vender?");
                    int loss = scanner.nextInt();
                    if (loss > 0) {
                        estoque -= loss;
                        if (estoque < 0)
                            System.out.println("Estoque insuficiente");
                        else
                            System.out.println("O estoque atual é: " + estoque);
                        break;
                    }else
                        System.out.println("O número de vendas deve ser positivo");

                // Opção 3, Mostra a quantia atualmente disponível no estoque
                case 3:
                    System.out.println("O estoque atual é: " + estoque);
                    break;

                // Opção 4, Encerra o programa
                case 4:
                    menu = false;
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;

                default:
                    System.out.println("Opção inválida tente novamente.");
            }



        }
        //Encerra o programa quando a condição se tornar falsa
        while (menu);

        // Desabilita o scanner ao encerrar o software
        scanner.close();
    }
}
