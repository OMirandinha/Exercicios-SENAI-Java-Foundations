import java.util.Scanner;

/*
Verifica se o número digitado é par ou ímpar
Obs. Utiliza o tipo de dado inteiro para fazer o exercício
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Digite um número");
        int n = num.nextInt();

        if (n%2 == 0){
            System.out.println("É um número par");
        }
        else {
            System.out.println("É um número ímpar");
        }
    }
}
