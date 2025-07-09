import java.util.Scanner;

/*
Crie um programa que verifique a nota e aprsenta as mensagens conforme as condições
- Se a nota digitada for maior que 90, apresentar "Aprovado com excelência!"
- Se a nota for menor ou igual a 90 e maior ou igual a 50, apresentar "aprovado"
- Senão, apresentar "Reprovado"
Obs. utilizar inteiros pra lidar com as notas
 */
public class ex08 {
    public static void main(String[] args) {
        System.out.println("Digite sua nota: ");
        Scanner leitura = new Scanner(System.in);
        int nota = leitura.nextInt();

        if (nota > 90)
            System.out.println("Aprovado com excelência");

        else if (nota <= 90 && nota >= 50)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
    }
}
