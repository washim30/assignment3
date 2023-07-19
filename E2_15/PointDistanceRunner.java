package E2_15;

import java.awt.*;

public class PointDistanceRunner {
    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(-3,-4);
        double dist = point1.distance(point2);
        System.out.println(dist);
    }
}
