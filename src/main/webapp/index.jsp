<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary Simple</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
  <form method="get" action="/translate">
    <div id = container>
      <h2>VietNam Dictionary</h2>
      <input type="text" name="word" id = "word" placeholder="Enter your word">
      <input type="submit" value="Search" id="search">
    </div>
  </form>
  </body>
</html>
