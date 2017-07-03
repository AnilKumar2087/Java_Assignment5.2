/*
 * A method that is declared as abstract and does not have implementation is known as abstract method.
 */

public class Rectangle extends Figure{
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double findArea() {
        // A = w * l
        return width * length;
    }

    @Override
    public double findPerimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
}
