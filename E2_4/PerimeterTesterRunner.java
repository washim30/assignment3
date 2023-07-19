package E2_4;

public class PerimeterTesterRunner {
    public static void main(String[] args) {
        PerimeterTester area = new PerimeterTester();
        area.setWidth(4);
        area.setHeigth(5);
        System.out.println(area.getPerimeter());
    }
}
