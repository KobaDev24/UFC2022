public class CompareTwoRectangles {
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
