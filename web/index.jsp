<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 03.04.2019
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="bootstrap.css">
  <link rel="stylesheet" href="bootstrap-grid.css">
  <link rel="stylesheet" href="bootstrap-reboot.css">
  <link rel="stylesheet" href="bootstrap.min.css">
  <link rel="stylesheet" href="bootstrap-grid.min.css">
  <link rel="stylesheet" href="bootstrap-reboot.min.css">
  <title>Home</title>


</head>
<body>
<body>
<div class="">
  <nav class=" container-fluid navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand/logo -->
    <ul class="col navbar-nav ">
      <li class="nav-item">
        <a class="col- nav-link active " href="/start">Главная</a>
      </li>
      <li class="nav-item">
        <a class="nav-link a" href="view/login.jsp">Оставить Обьявление</a>
      </li>
    </ul>
  </nav>
</div>
<div>
  <table>
    <c:forEach var = "user" items="${users}">
      <tr>
        <td>${user.name}</td>
        <td>${user.lastname}</td>
      </tr>
    </c:forEach>


  </table>

</div>

</body>


</html>
