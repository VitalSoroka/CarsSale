<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 04.04.2019
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>auto</title>
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


<div class="container col-md-6 col-md-offset-3 mrg-top">
    <div class="col-md-12 ">
        <!--Windows-->
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="fa fa-2x"></i> Microsoft Windows</h3>
            </div>
            <div class="panel-body">
                <img src=""></a>
                <ul>
                    <li>Developer: <a href="http://www.microsoft.com/en-us/default.aspx" target="_blank">Microsoft</a></li>
                    <li>Written in: Assembly, C, C++</li>
                    <li>OS family: Windows 9x, Windows CE and Windows NT</li>
                    <li>Working state: Publicly released</li>
                    <li>Source model: Closed / Shared source</li>
                    <li>Initial release: November 20, 1985; 28 years ago, as Windows 1.0</li>
                    <li>Marketing target: Personal computing</li>
                    <li>Available in: 137 languages</li>
                    <li>Update method: Windows Update, Windows Anytime Upgrade, Windows Store, WSUS</li>
                    <li>Package manager: Windows Installer (.msi), Windows Store (.appx)</li>
                    <li>Supported platforms: ARM, IA-32, Itanium, x86-64</li>
                    <li>Kernel type: Windows NT family: Hybrid, Windows 9x and earlier: Monolithic (MS-DOS)</li>
                    <li>Default user interface:	Windows shell</li>
                    <li>License: Proprietary commercial software</li>
                    <li><i class="fa fa-external-link"></i> Official website: <a href="http://windows.microsoft.com/" target="_blank">windows.microsoft.com</a></li>
                    <li><i class="fa fa-external-link"></i> Source: <a href="http://en.wikipedia.org/wiki/Microsoft_Windows" target="_blank">en.wikipedia.org/wiki/Microsoft_Windows</a></li>
                </ul>
                <form>
                    <div class="row">
                        <div class="col-md-6 ">
                            <input type="button" value="Delete" class="btn btn-info btn-block col-md-3" onclick='location.href = "/registration"'>
                        </div>
                        <div class="col-md-6 ">
                            <input type="button" value="Update" class="btn btn-info btn-block col-md-3" onclick='location.href = "/registration"'>
                        </div>
                    </div>
                </form>
            </div>

        </div>

    </div>

</div>

</body>

</body>
</html>
