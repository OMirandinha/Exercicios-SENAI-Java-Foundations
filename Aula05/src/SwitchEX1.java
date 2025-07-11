import java.util.Scanner;

public class SwitchEX1 {
    public static void main(String[] args) {
        System.out.println("Digite o mês respectivo: ");
        Scanner ler = new Scanner(System.in);
        int month = ler.nextInt();
        String name;

        switch (month) {

            case 1:
                name = "Janeiro";
                System.out.println(name);
                break;

            case 2:
                name = "Fevereiro";
                System.out.println(name);
                break;

            case 3:
                name = "Março";
                System.out.println(name);
                break;

            case 4:
                name = "Abril";
                System.out.println(name);
                break;

            case 5:
                name = "Maio";
                System.out.println(name);
                break;

            case 6:
                name = "Junho";
                System.out.println(name);
                break;

            case 7:
                name = "Julho";
                System.out.println(name);
                break;

            case 8:
                name = "Agosto";
                System.out.println(name);
                break;

            case 9:
                name = "Setembro";
                System.out.println(name);
                break;

            case 10:
                name = "Outubro";
                System.out.println(name);
                break;

            case 11:
                name = "Novembro";
                System.out.println(name);
                break;

            case 12:
                name = "Dezembro";
                System.out.println(name);
                break;

            default:
                System.out.println("Input inválido");

        }
    }
}


