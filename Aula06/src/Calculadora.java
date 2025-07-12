import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double n1 = leitura.nextDouble();

        System.out.println("Digite o operador");
        char operador = leitura.next();

        System.out.println("Digite o segundo número");
        double n2= leitura.nextDouble();

        double resultado = 0;
        boolean operacaovalida = true;

        switch (operador){
            case '+':
                resultado = n1 + n2;
                break;

            case '-':
                resultado = n1 - n2;
                break;

            case '*':
                resultado = n1 * n2;
                break;

            case '/':
                resultado = n1 / n2;
                break;

            default:
                System.out.println("Operador inválido");
                operacaovalida = false;
                break;

        }

        if (operacaovalida){
            System.out.println("O resultado da operação é " + resultado);
        }

        leitura.close();
    }
}
