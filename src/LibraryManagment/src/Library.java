package LibraryManagment.src;

import java.sql.*;
import java.util.Scanner;

 class Library {


    public void listBooks() {
        String query = "SELECT * FROM booklish";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Library Books List:");
            while (rs.next()) {
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Author: " + rs.getString("author"));
                System.out.println("Year: " + rs.getInt("year"));
                System.out.println("Pages: " + rs.getInt("pages"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching book list: " + e.getMessage());
        }
    }


    public void borrowBook(Scanner scanner) {
        System.out.println("Enter the title of the book you want to borrow: ");
        String title = scanner.nextLine();

        String checkAvailabilityQuery = "SELECT * FROM booklish WHERE title = ? AND is_borrowed = FALSE";
        String borrowBookQuery = "UPDATE booklish SET is_borrowed = TRUE WHERE title = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkAvailabilityQuery);
             PreparedStatement borrowStmt = conn.prepareStatement(borrowBookQuery)) {

            checkStmt.setString(1, title);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                borrowStmt.setString(1, title);
                borrowStmt.executeUpdate();
                System.out.println("You have successfully borrowed the book: " + title);
            } else {
                System.out.println("Sorry, the book \"" + title + "\" is not available.");
            }
        } catch (SQLException e) {
            System.out.println("Error borrowing the book: " + e.getMessage());
        }
    }


    public void returnBook(Scanner scanner) {
        System.out.println("Enter the title of the book you want to return: ");
        String title = scanner.nextLine();

        String checkBorrowedQuery = "SELECT * FROM booklish WHERE title = ? AND is_borrowed = TRUE";
        String returnBookQuery = "UPDATE booklish SET is_borrowed = FALSE WHERE title = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkBorrowedQuery);
             PreparedStatement returnStmt = conn.prepareStatement(returnBookQuery)) {

            checkStmt.setString(1, title);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                returnStmt.setString(1, title);
                returnStmt.executeUpdate();
                System.out.println("You have successfully returned the book: " + title);
            } else {
                System.out.println("The book \"" + title + "\" was not borrowed.");
            }
        } catch (SQLException e) {
            System.out.println("Error returning the book: " + e.getMessage());
        }
    }
}
