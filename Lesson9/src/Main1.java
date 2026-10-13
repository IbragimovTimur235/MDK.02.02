void main() {
    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника 4см*6см = " + rectangle.getArea());

    Square square = new Square(3);
    System.out.println("Площадь квадрата 3см*3см = " + square.getArea());

    Rhombus rhombus = new Rhombus(4, 3);
    System.out.println("Площадь ромба со стороной 4см и высотой 3см = " + rhombus.getArea());

    Circle circle = new Circle(2);
    System.out.println("Площадь круга с радиусом 2см = " + circle.getArea());
}
public interface Figure {
    double getArea();
}
public abstract class Parallelogram implements Figure {
    protected final double a;
    protected final double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b);
    }
}
public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }
}
public class Rhombus extends Parallelogram {
    public Rhombus(double a, double h) {
        super(a, h);
    }
}
public class Circle implements Figure {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}