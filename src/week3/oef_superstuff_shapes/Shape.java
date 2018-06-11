package week3.oef_superstuff_shapes;

public abstract class Shape {


    public abstract void area ();
    public abstract void perimeter ();

    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.area();
        s.perimeter();

        Circle c = new Circle();
        c.area();
        c.perimeter();

        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }

}
