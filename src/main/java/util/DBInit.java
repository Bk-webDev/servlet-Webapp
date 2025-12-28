package util;

import java.sql.*;

public class DBInit {
    static {
        try (Connection c = DBUtil.getConnection();
             Statement s = c.createStatement()) {

            s.execute("""
                CREATE TABLE IF NOT EXISTS students(
                  id INT AUTO_INCREMENT PRIMARY KEY,
                  name VARCHAR(100) NOT NULL,
                  email VARCHAR(100) UNIQUE NOT NULL,
                  year INT NOT NULL
                )
            """);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
