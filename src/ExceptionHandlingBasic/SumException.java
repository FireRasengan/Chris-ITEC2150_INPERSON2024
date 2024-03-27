package ExceptionHandlingBasic;
import java.util.Scanner;

public class SumException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter two integers.");
            int num1 = input.nextInt();
            if (input.hasNextInt()) {
                int num2 = input.nextInt();
                sum = num1 + num2;
                break;
            } else {
                System.out.println("Invalid input. You must enter correct integer values.");
                input.nextLine();
            }
        }
        System.out.println("Sum of two values is " + sum);
        input.close();
    }
}