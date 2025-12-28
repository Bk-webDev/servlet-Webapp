package dao;

import model.Student;
import util.*;

import java.sql.*;
import java.util.*;

public class StudentDAO {
    static { new DBInit(); }

    public static void add(Student s) throws Exception {
        String sql = "INSERT INTO students(name,email,year) VALUES(?,?,?)";
        try (Connection c = DBUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, s.name);
            ps.setString(2, s.email);
            ps.setInt(3, s.year);
            ps.executeUpdate();
        }
    }

    public static List<Student> all() throws Exception {
        List<Student> list = new ArrayList<>();
        try (Connection c = DBUtil.getConnection();
             ResultSet rs = c.createStatement()
                 .executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                list.add(new Student(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getInt("year")
                ));
            }
        }
        return list;
    }
}
