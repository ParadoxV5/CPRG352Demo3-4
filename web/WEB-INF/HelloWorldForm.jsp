<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World Form</title>
  </head>
  <body>
    
    <h1>Hello World Form</h1>
    <form method="POST" action="HelloWorld">
      <label for="person.name">Name</label>
      <input id="person.name" name="person.name" type="text" autocomplete="nickname" value="${person.name}">
      <input type="submit">
    </form>
    
    <%-- id="error_message" --%>
    <c:if test="${isNull_name}">
      <p style="font-size: 75%; color: red">Please enter a name (:</p>
    </c:if>
  </body>
</html>