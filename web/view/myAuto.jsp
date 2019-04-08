<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 05.04.2019
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <style>
        .mrg-top{
            margin-top: 60px;
        }
        .white{
            background-color: white;
        }
    </style>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<link href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

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
                    <li class=""><a href="/createAuto?password=${password}&account_id=${account_id}&message=null">Добавить обьявление</a></li>
                    <li class=""><a href="#">Locations</a></li>
                    <li class=""><a href="#">About</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/login" data-toggle="modal" data-target='#modalRegister'>Account</a></li>
                </ul>

            </div>
        </div>
    </nav>
</div>

<div class="container col-md-6 col-md-offset-3 mrg-top">
    <c:forEach var="auto" items="${autos}">
        <div class="col-md-12 ">
            <!--Windows-->
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="fa fa-2x"></i>${auto.brand.name} ${auto.nameModel}</h3>
                </div>
                <div class="panel-body">
                    <img src=""></a>
                    <ul>
                        <li>Цена: ${auto.cost} бел. рублей</li>
                        <li>Год выпуска: ${auto.yearOfIssue}</li>
                        <li>Пробег: ${auto.mileage}</li>
                        <li>Тип топлива: ${auto.typeFuel}</li>
                        <li>Цвет: ${auto.color}</li>
                        <li>Мощность дигателя: ${auto.enginePower} л. c.</li>
                        <li>Объём двгателя: ${auto.engineVolume} куб. см</li>
                        <li>Привод: ${auto.driveUnit}</li>
                        <li>Коробка передач: ${auto.transmission}</li>
                    </ul>
                    <div class="row">
                        <div class="col-md-6 ">
                            <form method="post" action="/deleteAuto">
                                <input type="hidden" value="${password}" name="password">
                                <input type="hidden" value="${account_id}" name="account_id">
                                <input type="hidden" value="${auto.autoId}" name = "auto_id">
                                <input type="submit" value="Delete"  class="btn btn-info btn-block col-md-3">
                            </form>
                        </div>
                        <div class="col-md-6 ">
                            <form method="get" action="/updateAuto">
                                <input type="hidden" value="${password}" name="password">
                                <input type="hidden" value="${account_id}" name="account_id">
                                <input type="hidden" value="${auto.autoId}" name = "auto_id">
                                <input type="submit" value="Update"  class="btn btn-info btn-block col-md-3" >
                            </form>
                        </div>

                    </div>
                </div>

            </div>

        </div>
    </c:forEach>

</div>

</body>
</html>
