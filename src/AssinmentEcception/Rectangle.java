package BeginnerJaVa.AssinmentEcception;
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeNumberNotSupported {
        if (width < 0 || height < 0) {
            throw new NegativeNumberNotSupported("Width and Height cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

