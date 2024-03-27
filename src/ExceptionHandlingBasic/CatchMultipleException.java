package ExceptionHandlingBasic;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultipleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator");
            int num = input.nextInt();
            System.out.println("Enter a denominator");
            int den = input.nextInt();

            int result = num / den;
            System.out.println("The result of the division is " + result);
        } catch(ArithmeticException e) {
            System.out.println(e);
            input.nextLine();
        } catch(InputMismatchException e) {
            System.out.println(e);
            input.nextLine();
        } catch(Exception e) {
            System.out.println(e);
            input.nextLine();
        }
    }
}