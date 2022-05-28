package ge.tbc3;

import ge.tbc1.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5);
        rectangle1.setWidth(2);

        Rectangle rec3 = new Rectangle();
        rec3.setWidth(4);
        rec3.setLength(9);

        ge.tbc2.Rectangle rectangle2 = new ge.tbc2.Rectangle();


        ge.tbc2.Rectangle rect4 = new ge.tbc2.Rectangle();
        ge.tbc2.Rectangle rect5 = new ge.tbc2.Rectangle();

        System.out.println(rectangle1.compareRectangles(rec3));

        System.out.println(rectangle2.compareRectangles(rect4, rect5));



    }
}
