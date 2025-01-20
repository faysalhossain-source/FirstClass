import java.sql.*;
import java.util.List;

class DatabaseHandler {
    public static void insertData(@org.jetbrains.annotations.NotNull List<String[]> data) {
        String url = "jdbc:oracle:thin:@//localhost:1521/orcle";
        String user = "orclpdbuser";
        String password = "isbd62";

        String query = "INSERT INTO items (id, name, buyer, seller, price, buyDate, sellDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (String[] row : data) {
                if (row[0].equals("id")) continue;

                stmt.setInt(1, Integer.parseInt(row[0]));
                stmt.setString(2, row[1]);
                stmt.setString(3, row[2]);
                stmt.setString(4, row[3]);
                stmt.setInt(5, Integer.parseInt(row[4]));
                stmt.setDate(6, Date.valueOf(row[5]));
                stmt.setDate(7, Date.valueOf(row[6]));

                stmt.executeUpdate();
            }

            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
