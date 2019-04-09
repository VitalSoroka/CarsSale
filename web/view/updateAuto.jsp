<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 08.04.2019
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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
                <a class="navbar-brand" href="#">Car Sale</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/myAuto?password=${password}&account_id=${account_id}" data-toggle="modal" data-target='#modalRegister'>Account</a></li>
                    <li><a href="/login" data-toggle="modal" data-target='#modalRegister'>Sign Up</a></li>
                </ul>

            </div>
        </div>
    </nav>
</div>


<div class="container mrg-top">
    <div class="row centered-form">
        <div class="col-xs-6 col-sm-6 col-md-6 col-sm-offset-3 col-md-offset-3 ">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Update info for auto</h3>
                </div>
                <div class="panel-body">
                    <form role="form" method="post" action="/updateAuto">
                        <input type="hidden" value="${password}" name="password">
                        <input type="hidden" value="${account_id}" name="account_id">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12">
                                <C:if test="${message != null}">
                                    <p class="text-warning">${message}</p>
                                </C:if>
                            </div >
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <select class="form-control input-sm" name="brand_id">
                                        <C:forEach var="brand" items="${brands}">
                                            <c:if test="${auto.brandId == brand.brandId}">
                                                <option selected value="${brand.brandId}">${brand.name}</option>
                                            </c:if>
                                            <c:if test="${auto.brandId != brand.brandId}">
                                                <option value="${brand.brandId}">${brand.name}</option>
                                            </c:if>

                                        </C:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Model</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="name_model" id="name_model" class="form-control input-sm" value="${auto.nameModel}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Cost ($)</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="cost" id="cost" class="form-control input-sm" value="${auto.cost}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Year of issue</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="year_of_issue" id="year_of_issue" class="form-control input-sm" value="${auto.yearOfIssue}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Color</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="color" id="color" class="form-control input-sm" value="${auto.color}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Mileage (km)</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="mileage" id="mileage" class="form-control input-sm" value="${auto.mileage}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Fuel</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="type_fuel" id="type_fuel" class="form-control input-sm" value="${auto.typeFuel}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Engine power</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="engine_power" id="engine_power" class="form-control input-sm" value="${auto.enginePower}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Engine volume</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="engine_volume" id="engine_volume" class="form-control input-sm" value="${auto.engineVolume}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Привод</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="drive_unit" id="drive_unit" class="form-control input-sm" value="${auto.driveUnit}">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Transmission</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="transmission" id="transmission" class="form-control input-sm" value="${auto.transmission}">
                                </div>
                            </div>
                        </div>
                        <input type="hidden" value="${auto.autoId}" name="auto_id">
                        <input type="submit" value="Update" class="btn btn-info btn-block">

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
