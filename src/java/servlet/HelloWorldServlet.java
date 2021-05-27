package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends jakarta.servlet.http.HttpServlet {
  private static final String ERROR_MESSAGE = "Please enter a name (:";
  private static final long serialVersionUID = 1;
  @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp").forward(request, response);
  }
  @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    request.setAttribute("name", name);
    
    if(name == null || name.trim().isEmpty()) { // Validation
      request.setAttribute("error_message", ERROR_MESSAGE);
      doGet(request, response); // Reload page by redirect to original form page
      return; // Stop execution – important~
    }
    
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorld.jsp").forward(request, response); // Continue
  }
}