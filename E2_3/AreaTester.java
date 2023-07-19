package E2_3;

public class AreaTester {
    private int width,height,area;
    public AreaTester(){
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
    public int getArea(){
        int area= width * height;
        return area;
    }


}
