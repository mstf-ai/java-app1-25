package app1.pkg25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaApp125 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mckawy_demo1";
        String user = "mostafa";
        String password = "Mostafa123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO users (name, email) VALUES (?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "Mostafa Khamis");
            ps.setString(2, "mostafa@example.com");

            int rows = ps.executeUpdate();

            System.out.println("Rows inserted: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
