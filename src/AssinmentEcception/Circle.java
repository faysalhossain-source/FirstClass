package AssinmentEcception;


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws NegativeNumberNotSupported {
        if (radius < 0) {
            throw new NegativeNumberNotSupported("Radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

