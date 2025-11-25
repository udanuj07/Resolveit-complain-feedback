package project;

import java.sql.*;

public class DB {
    static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/resolveit",
                    "root",
                    "YOUR_PASSWORD"
            );
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
