package week3.oef_superstuff_shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public void area() {
        System.out.println("area methode");
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter methode");
    }
}
