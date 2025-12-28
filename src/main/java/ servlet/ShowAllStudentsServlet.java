package servlet;

import dao.StudentDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ShowAllStudentsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest r, HttpServletResponse s)
            throws ServletException, IOException {
        try {
            r.setAttribute("students", StudentDAO.all());
            r.getRequestDispatcher("students.jsp").forward(r, s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
