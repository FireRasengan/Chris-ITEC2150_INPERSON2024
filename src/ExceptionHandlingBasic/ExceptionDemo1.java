package ExceptionHandlingBasic;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter an integer");
            int number = input.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}