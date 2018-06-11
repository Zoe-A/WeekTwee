package week3.oef_superstuff_shapes;

public class Circle extends Shape {
    private double radius = 3;

    @Override
    public void area() {
        double area = Math.PI * (radius*radius);
        System.out.println("The area of a circle is " + Math.round(area));
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of this circle is " + Math.round(perimeter));
    }
}
