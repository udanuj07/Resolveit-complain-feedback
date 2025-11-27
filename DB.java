package project;

import java.sql.*;

/**
 * Database utility class for managing MySQL connections.
 * Provides static method to establish JDBC connection to ResolveIt database.
 */
public class DB {
/**
     * Establishes and returns a JDBC connection to the MySQL ResolveIt database.
     * Updates DB credentials in this method: DB_URL, DB_USER, DB_PASSWORD
     * @return Connection object connected to ResolveIt database, or null if connection fails
     */
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

