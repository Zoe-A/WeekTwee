package week3.oef_superstuff_shapes;

public class Triangle extends Shape {
    private double base = 2;
    private double height = 3;

    @Override
    public void area() {
        double area = (base*height)/2;
        System.out.println("The area of this triangle is " + area);
    }

    @Override
    public void perimeter() {
        System.out.println("Whut?");
    }
}
