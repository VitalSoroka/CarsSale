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
</head>
<body>
<div class="container">
    <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please sign up for Bootsnipp <small>It's free!</small></h3>
                </div>
                <div class="panel-body">
                    <form role="form">

                        <div class="form-group">
                            <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
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

