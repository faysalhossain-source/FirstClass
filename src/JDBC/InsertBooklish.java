package JDBC;

import java.math.BigDecimal;
import java.sql.*;

public class InsertBooklish {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1245";

    public void insertDummyBook(String[][] books) {
        String insertQuery = "INSERT INTO booklish (bookname,bookauthor, bookgenre,bookprice, bookpublishdate) VALUES (?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {


            for (String[] book : books) {
                preparedStatement.setString(1, book[0]);
                preparedStatement.setString(2, book[1]);
                preparedStatement.setString(3, book[2]);
                preparedStatement.setBigDecimal(4, new BigDecimal(book[3]));
                preparedStatement.setDate(5, Date.valueOf(book[4]));

                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows Inserted: " + rowsInserted.length);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
