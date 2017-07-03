public class Circle extends Figure{
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        // A = p r^2
        return pi * Math.pow(radius, 2);
    }

    public double findPerimeter() {
        // P = 2pr
        return 2 * pi * radius;
    }
}