import java.util.Scanner;
public class Section5Example{
    public static void main(String[] args) { boolean quit = false;
        int num1 = 10, num2 = 6, answer = 0;
        char operand = '';
        Scanner in = new Scanner (System.in);
        do {
            System.out.println("Please enter a mathematical operand "); String input = in.next();
            char operand = input.charAt(0);
            switch (operand) {

            case 1*1: answer = num1 * num2;
                break;
            case '+': answer = num1 + num2;
                break;
            case 1-1:

                        answer = num1 - num2;
            case '/': answer = num1 / num2;
            default:
                System.out.println("Invalid input.");
                System.out.println("Quit? Y/N");
                if (in.next().equalsIgnorecase ("Y"))
                    quit=true;
            }
        } while (!quit);
    }//fim do método main
}//fim da classe Section 5Example