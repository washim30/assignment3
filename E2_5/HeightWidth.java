package E2_5;

import java.awt.*;

public class HeightWidth {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6,7);
        Rectangle rectangle2 = new Rectangle(2,11);
        System.out.println("width of rectangle from area :"+ rectangle1.getWidth());
        System.out.println("height of rectangle from area :"+ rectangle1.getHeight());
        System.out.println("width of rectangle from perimeter :"+ rectangle2.getWidth());
        System.out.println("height of rectangle from perimeter :"+ rectangle2.getHeight());
    }
}
