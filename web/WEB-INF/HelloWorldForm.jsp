<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World Form</title>
  </head>
  <body>
    <h1>Hello World Form</h1>
    <form method="POST" action="HelloWorld">
    <label for="name">Name</label>
    <input id="name" name="name" type="text" autocomplete="nickname" value="${name}">
    <input type="submit">
  </form>
  <p id="error_message" style="font-size: 75%; color: red">${error_message}</p>
  </body>
</html>