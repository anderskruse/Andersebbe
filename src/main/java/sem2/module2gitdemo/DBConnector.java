package sem2.module2gitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class DBConnector {

    private static String url = "jdbc:mysql://165.227.156.143:3306/test";
    private static String username = "testuser1";

    private static String password = "password123";

    public static Connection connection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection( url, username, password );
            return connection;
    }

}
