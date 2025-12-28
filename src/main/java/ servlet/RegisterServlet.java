package servlet;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest r, HttpServletResponse s)
            throws IOException {
        try {
            StudentDAO.add(new Student(
                r.getParameter("name"),
                r.getParameter("email"),
                Integer.parseInt(r.getParameter("year"))
            ));
            s.sendRedirect("show_all");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
