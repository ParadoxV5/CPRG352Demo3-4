package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends jakarta.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1;
  @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp").forward(request, response);
  }
  @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("name", request.getParameter("name"));
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorld.jsp").forward(request, response);
  }
}