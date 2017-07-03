

/*
 * 
 */

public class MainClass {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Figure rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.findArea()
                + "\nResulting perimeter: " + rectangle.findPerimeter() + "\n");

        // Circle test
        double radius = 5;
        Figure circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.findArea()
            + "\nResulting Perimeter: " + circle.findPerimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Figure triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.findArea()
                + "\nResulting Perimeter: " + triangle.findPerimeter() + "\n");
    }
}

