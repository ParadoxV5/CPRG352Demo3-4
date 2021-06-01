package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1;
  
  @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp").forward(request, response);
  }
  
  @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    model.Person person = new model.Person(request.getParameter("person.name"));
    request.setAttribute("person", person);
    
    if(person.getName().trim().isEmpty()) { // Validation
      //request.setAttribute("error_message", "Please enter a name (:");
      request.setAttribute("isNull_name", Boolean.TRUE);
      doGet(request, response); // Reload page by redirect to original form page
      return; // Stop execution – important~
    }
    
    getServletContext().getRequestDispatcher("/WEB-INF/HelloWorld.jsp").forward(request, response); // Continue
  }
}