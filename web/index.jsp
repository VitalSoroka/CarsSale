<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 03.04.2019
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="">
  <nav class=" container-fluid navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand/logo -->
    <ul class="col navbar-nav ">
      <li class="nav-item">
        <a class="col- nav-link active " href="/start">Главная</a>
      </li>
      <li class="nav-item">
        <a class="nav-link a" href="/login">Оставить Обьявление</a>
      </li>
    </ul>
  </nav>
</div>
<div>
  <table>
   <c:forEach var="auto" items="${autos}">
     <tr>
       <td>
         <p>Марка  ${auto.brand.name}</p>
         <p>Модель  ${auto.nameModel}</p>
         <p>Цена  ${auto.cost}</p>
         <p>Цвет ${auto.color}</p>
         <p>Пробег ${auto.mileage}</p>
         <p>${auto.autoId}</p>
         <a href="/auto?auto_id=${auto.autoId}">перейти к автомобилю</a>>
         <hr>

       </td>
     </tr>
   </c:forEach>
  </table>

</div>

</body>


</html>
