import java.util.Scanner;

/*
Verifique se o número digitado é positivo
Obs. Utilizar número inteiro como tipo de dados.
 */
public class ex04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = ler.nextInt();

        if (numero>0) {
            System.out.println("É um número positivo");
        }
        else{
            System.out.println("É um número negativo");
        }
    }
}
