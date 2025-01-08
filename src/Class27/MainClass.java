package Class27;

public class MainClass {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.calculateArea());


        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());


        Shape square = new Square(4.0);
        System.out.println("Area of square: " + square.calculateArea());
    }
}
