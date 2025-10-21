package HinhHoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(2.5, "blue", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5.0, "black", false);
        System.out.println(square);
    }
}
