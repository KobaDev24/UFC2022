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

    public int perimeter(){
        return 2*(length + width);
    }
    public int area(){
        return length * width;
    }
}
