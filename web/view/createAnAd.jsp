<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 04.04.2019
  Time: 23:04
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
                    <li class=""><a href="#">Home</a></li>
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


<div class="container mrg-top">
    <div class="row centered-form">
        <div class="col-xs-6 col-sm-6 col-md-6 col-sm-offset-3 col-md-offset-3 ">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please sign up for Bootsnipp <small>It's free!</small></h3>
                </div>
                <div class="panel-body">
                    <form role="form">
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <select class="form-control input-sm">
                                        <option>Пункт 1</option>
                                        <option>Пункт 2</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="name_model" id="name_model" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <select class="form-control input-sm">
                                        <option>Пункт 1</option>
                                        <option>Пункт 2</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="cost" id="cost" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="year_of_issue" id="year_of_issue" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="color" id="color" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="mileage" id="mileage" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="type_fuel" id="type_fuel" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="engine_power" id="engine_power" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="engine_volume" id="engine_volume" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="drive_unit" id="drive_unit" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="transmission" id="transmission" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="user" id="user" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <p>Brand</p>
                            </div >
                            <div class="col-xs-8 col-sm-8 col-md-8">
                                <div class="form-group">
                                    <input type="text" name="phone" id="phone" class="form-control input-sm" placeholder="Brand">
                                </div>
                            </div>
                        </div>



                        <input type="submit" value="Register" class="btn btn-info btn-block">

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

