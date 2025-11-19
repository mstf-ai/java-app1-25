package app1.pkg25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/mckawy_demo1",
            "mostafa",
            "Mostafa123"
        );
    }
}
