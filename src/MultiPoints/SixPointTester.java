package MultiPoints;

/**
 * class: SixPointTester
 * description
 * @author: cjabbour
 */
import java.util.Scanner;
public class SixPointTester {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        computeShortestDistance(enterPoints());
    }

    public static Point[] enterPoints() {
        Point[] points = new Point[6];
        System.out.println("Enter 6 points of x and y coordinates: ");

        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ": ");
            points[i] = new Point(input.nextDouble(), input.nextDouble());
        }
        return points;
    }

    public static void computeShortestDistance(Point[] points) {
        double shortestDistance = Double.MAX_VALUE;
        Point p1 = null;
        Point p2 = null;

        String pName1 = "";
        String pName2 = "";

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = Point.distance(points[i], points[j]);
                if (dist < shortestDistance) {
                    pName1 = "Point " + (i + 1);
                    pName2 = "Point " + (j + 1);
                    shortestDistance = dist;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }
        System.out.printf("The shortest distance of two points are %s (%.1f, %.1f) and %s (%.1f, %.1f) " +
                "and their distance is (%.2f)", pName1, p1.getX(), p1.getY(), pName2, p2.getX(), p2.getY(), shortestDistance);
    }
}