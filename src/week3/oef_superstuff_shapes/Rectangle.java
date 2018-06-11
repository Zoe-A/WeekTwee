package week3.oef_superstuff_shapes;

public class Rectangle extends Shape {
    private double width = 9;
    private double height = 3;

    @Override
    public void area() {
        double area = width*height;
        System.out.println("The area of the rectangle is " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2*(width+height);
        System.out.println("The perimeter of this rechtangle is " + perimeter);
    }
}
