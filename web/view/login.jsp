<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 04.04.2019
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link href="styles.css" rel="stylesheet">
    <style>
        .mrg-top{
            margin-top: 60px;
        }
        .white{
            background-color: white;
        }
    </style>
    <title>Title</title>

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
                </ul>

            </div>
        </div>
    </nav>
</div>


<div class="container mrg-top">
    <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Вход в аккаунт</h3>
                </div>
                <div class="panel-body">
                    <form role="form" method="post" action="/login">
                        <div class="form-group">
                            <c:if test="${message != null}">
                            <p>${message}</p>
                            </c:if>
                        </div>
                        <div class="form-group">
                            <input type="email" name="login" id="email" class="form-control input-sm" placeholder="Email Address">
                        </div>


                        <div class="form-group">
                            <div class="form-group">
                                <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
                            </div>
                        </div>

                        <input type="submit" value="Sig In" class="btn btn-info btn-block" >
                        <input type="button" value="Register" class="btn btn-info btn-block" onclick='location.href = "/registration"'>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>

