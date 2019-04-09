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

  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
  <link href="view/styles.css" rel="stylesheet">
  <title>Home</title>
  <style>
    .data{
      margin-top: 60px;
    }
    .white{
      background-color: white;
    }

  </style>


</head>
<body>
  <div >
    <nav class="navbar navbar-primary white navbar-fixed-top" >
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/start">Car Sale</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class=""><a href="/start">Home</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="/registration" data-toggle="modal" data-target='#modalRegister'>Registration</a></li>
            <li><a href="/login" data-toggle="modal" data-target='#modalRegister'>Sign In</a></li>
          </ul>

        </div>
      </div>
    </nav>
  </div>
  <div class="data">
    <c:forEach var = "auto" items="${autos}">
      <div class="col-md-12">
        <div class="panel panel-primary">
          <div class="panel-heading">
            <h3 class="panel-title"><i class="fa fa-2x"></i>${auto.brand.name} ${auto.nameModel}</h3>
          </div>
          <div class="panel-body">
            <img src=""></a>
            <ul>
              <li>Cost : ${auto.cost} $ </li>
              <li>Year of issue : ${auto.yearOfIssue}</li>
              <li>Mileage: ${auto.mileage} km<li>
              <a href="/auto?auto_id=${auto.autoId}">to auto</a>
            </ul>
          </div>
        </div>
      </div>
    </c:forEach>
  </div>



</body>


</html>
