import java.util.Scanner;

/*
Crie um programa que verifique se um número digitado é menor que 100
Se o número for menor que 100, apresentar "Número menor que 100"
Senão, apresentar "Número maior ou igual a 100""
 */
public class ex07 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite um número");

        int x = dado.nextInt();
        if (x < 100)
            System.out.println("Número menor que 100");
         else if (x >= 100)
            System.out.println("Número maior ou igual a 100");
    }
}
