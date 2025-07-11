import java.util.Scanner;

public class VerificacaoAcesso {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String user = leitura.nextLine();

        if(user.equalsIgnoreCase("admin")) {

            System.out.println("Digite a senha: ");
            String senha = leitura.nextLine();

            if (senha.equals("12345"))
                System.out.println("Login efetuado com sucesso");

            else
                System.out.println("Senha incorreta");
        }
        else {
            System.out.println("usuário inválido");
        }

        leitura.close();
    }
}
