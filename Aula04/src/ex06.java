import java.util.Scanner;

/*
Crie um programa em Java que verifique se a idade da pessoa.
Se tiver 18 anos ou mais, apresentar a mensagem "Maior de idade"
Senão, apresentar a mensagem "Menor de idade"
 */
public class ex06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = leitura.nextInt();

        if (idade >= 18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");

    }
}
