import java.sql.*;
import java.util.ArrayList;

class ReadDataFromTheDatabase {

    public static ArrayList<Object> readDataFromDatabase() {
        ArrayList<Object> data = new ArrayList<>();
        String url = "jdbc:oracle:thin:@//localhost:1521/orcle";
        String user = "orclpdbuser";
        String password = "isbd62";

        String query = "SELECT * FROM items";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query)) {

            while (rs.next()) {
                String[] row = new String[7];
                row[0] = String.valueOf(rs.getInt("id"));
                row[1] = rs.getString("name");
                row[2] = rs.getString("buyer");
                row[3] = rs.getString("seller");
                row[4] = String.valueOf(rs.getInt("price"));
                row[5] = rs.getDate("buyDate").toString();
                row[6] = rs.getDate("sellDate").toString();
                data.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

}
