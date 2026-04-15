
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/it26b";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        return null;
    }
}