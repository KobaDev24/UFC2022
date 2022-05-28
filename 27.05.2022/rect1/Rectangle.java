package ge.tbc1;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int newLength){
        length = newLength;
    }
    public int getLength(){
        return length;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }
    public int getWidth(){
        return width;
    }

    private int perimeter(){
        return 2*(length + width);
    }
    private int area(){
        return length * width;
    }


    public int compareRectangles(Rectangle a){
        if (a.area() > this.area()){
            return 1;
        }
        if(this.area() > a.area()){
            return -1;
        }
        return 0;
    }
}
