package ge.tbc2;

public class Rectangle {
    private int width;
    private int length;

    protected int area(){
        return 2*(width + length);
    }

    public int compareRectangles(Rectangle a, Rectangle b){
        if (a.area() > b.area()){
            return 1;
        }
        if(b.area() > a.area()){
            return -1;
        }
        return 0;
    }

}
