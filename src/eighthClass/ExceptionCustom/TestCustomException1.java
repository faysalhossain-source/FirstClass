package eighthClass.ExceptionCustom;

// Main Class (Only one public class allowed in a file)
public class TestCustomException1 {

    // Custom Exception Class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String str) {
            super(str);
        }
    }

    // Method to validate age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    // Main Method
    public static void main(String args[]) {
        try {
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + ex);
        }
        System.out.println("rest of the code...");
    }
}

