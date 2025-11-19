package app1.pkg25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaApp125 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mckawy_demo1"; 
        String user = "mostafa";
        String password = "Mostafa123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
