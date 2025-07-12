import java.util.Scanner;

public class CategoriaPorIdade {
    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();

        //Limpa o buffer do scanner
        ler.nextLine();

        if(idade >= 18 && idade < 60){

            System.out.println("Você tem a permissão dos seus pais?");
            String res = ler.nextLine();

            if(res.equalsIgnoreCase("sim"))
                System.out.println("Acesso concedido com autorização");

            else
                System.out.println("Acesso negado sem autorização");

        } else if(idade >= 60)
            System.out.println("Você tem direito a benefícios de terceira idade");

        else if (idade < 18)
            System.out.println("Acesso permitido apenas para maiores de idade");
    }
}
