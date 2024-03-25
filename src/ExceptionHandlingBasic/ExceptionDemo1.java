package ExceptionHandlingBasic;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.println("Enter an integer");
                int number = input.nextInt();
                flag = false;
                System.out.println("You entered " + number);
            } catch (Exception e) {
                System.out.println("You entered invalid type. Please enter an integer");
                input.nextLine();
            }
        } while (flag);
    }
}