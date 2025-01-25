package LibraryManagment.src;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("Choose an option: ");
            System.out.println("1. List of books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.print("4. Terminate the program:" + " ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    library.borrowBook(scanner);
                    break;
                case 3:
                    library.returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Program Terminated.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
