import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        int res, value1, value2, resultado = 0;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Bem vindo à calculadora do SENAI!");
            System.out.println("1 - Multiplicação");
            System.out.println("2 - Divisão");
            System.out.println("3 - Soma");
            System.out.println("4 - Subtração");
            System.out.println("0 - Encerrar");
            System.out.println("Digite o valor respectivo à operação");
            res = ler.nextInt();

            System.out.println("Digite os valores a serem operados");
            value1 = ler.nextInt();
            value2 = ler.nextInt();

                switch (res){
                    case 1:
                        resultado = value1 * value2;
                        System.out.println("O resultado é " + resultado);
                        break;

                    case 2:
                        if (value1 == 0 && value2 == 0)
                            System.out.println("A divisão de 0 por 0 é matematicamente impossível");

                        resultado = value1 / value2;
                        System.out.println("O resultado é " + resultado);
                        break;

                    case 3:
                        resultado = value1 + value2;
                        System.out.println("O resultado é " + resultado);
                        break;

                    case 4:
                        resultado = value1 - value2;
                        System.out.println("O resultado é " + resultado);
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente");
                        break;


                }


        }while(res != 0);
        System.out.println("Encerrando...");

    }
}
