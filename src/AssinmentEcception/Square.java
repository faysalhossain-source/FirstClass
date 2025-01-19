package AssinmentEcception;
public class Square extends Rectangle {

    public Square(double side) throws NegativeNumberNotSupported {
        super(side, side);
        if (side < 0) {
            throw new NegativeNumberNotSupported("Side cannot be negative");
        }
    }
}

