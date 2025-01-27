public class Main {
    public static void main(String[] args) {
        try {

            Circle circle = new Circle(-5);
            Rectangle rectangle = new Rectangle(4, 6);
            Square square = new Square(5);


            System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
            System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
            System.out.printf("Square Area: %.2f%n", square.calculateArea());

        } catch (NegativeNumberNotSupported e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

