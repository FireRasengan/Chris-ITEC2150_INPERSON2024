package MultiPoints;
import java.util.Scanner;
public class PointTesterDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x and y for two points a and b");
        //double x1 = input.nextDouble();
        //double y1 = input.nextDouble();

        //double x2 = input.nextDouble();
        //double y2 = input.nextDouble();

        //Point p1 = new Point(x1, y1);
        //Point p2 = new Point(x2, y2);

        Point p3 = new Point(input.nextDouble(), input.nextDouble());
        Point p4 = new Point(input.nextDouble(), input.nextDouble());

        //distance(p1, p2);
        distance(p3, p4);
    }


    public static void distance(Point p1, Point p2) {
        double distanceFinal = Point.distance(p1, p2);
        System.out.printf("The distance between (%.2f , %.2f) and (%.2f , %.2f) is %.2f",
                p1.getX(), p1.getY(), p2.getX(), p2.getY(), distanceFinal);
    }
}
