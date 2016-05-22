<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Login</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="span6">
                        <div class="area">
                            <form class="form-horizontal">
                                <div class="heading">
                                    <h4 class="form-heading">Sign In</h4>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for=
                                    "inputUsername">E-Mail</label>

                                    <div class="controls">
                                        <input id="inputUsername" placeholder=
                                        "E.g. johndoe@domain.com" type="text">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for=
                                    "inputPassword">Password</label>

                                    <div class="controls">
                                        <input id="inputPassword" placeholder=
                                        "********" type="password">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <div class="controls">
<!--                                        <label class="checkbox"><input type="checkbox">
                                        Keep me signed in ¦ <a class="btn btn-link"
                                        href="#">Forgot my password</a></label>-->
                                        <button class="btn btn-success" type=
                                        "submit">Sign In</button>
                                    </div>
                                </div>

<!--                                <div class="alert alert-error">
                                    <button class="close" data-dismiss="alert" type=
                                    "button">×</button> <strong>Access Denied!</strong>
                                    Please provide valid authorization.
                                </div>-->
                            </form>
                        </div>
                    </div>
                </div>    
            </div>        
        </div>            
    </body>
</html>
