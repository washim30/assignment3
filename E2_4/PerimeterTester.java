package E2_4;

public class PerimeterTester {
    private int width,height;
    public PerimeterTester(){
        width = 0;
        height = 0;
    }
    public int setWidth(int width)
    {
        this.width = width;
        return width;
    }
    public int setHeigth(int height)
    {
        this.height = height;
        return height;
    }
    public int getPerimeter(){
        int perimeter = 2 * (width + height) ;
        return perimeter;
    }

}
