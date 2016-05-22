<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - SignUp</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="span6">
                        <div class="area">
                            <form class="form-horizontal" method="post" role="form"
                                                 action="/signup">
        <div class="heading">
                                    <h4 class="form-heading">Sign Up</h4>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="username">Username
                                    </label>

                                    <div class="controls">
                                        <input id="username" placeholder=
                                        "E.g. JohnDoe" type="text">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for=
                                    "inputEmail">E-Mail</label>

                                    <div class="controls">
                                        <input id="inputEmail" placeholder=
                                        "E.g. johndoe@domain.com" type="text">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for=
                                    "password">Password</label>

                                    <div class="controls">
                                        <input id="password" placeholder=
                                        "Min. 6 Characters" type="password">
                                    </div>
                                </div>
                                
                                                                <div class="control-group">
                                    <label class="control-label" for=
                                    "inputPassword">Confirm Password</label>

                                    <div class="controls">
                                        <input id="inputPassword" placeholder=
                                        "Same as password" type="password">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <div class="controls"> <input class=
                                        "btn btn-success" type="submit">Sign
                                        Up</input>
                                    </div>
                                </div>

<!--                                <div class="alert alert-info">
                                    <button class="close" data-dismiss="alert" type=
                                    "button">×</button> <strong>Confirmation:</strong>
                                    A confirmation email has been sent to your
                                    email.<br>
                                    Thank you for your registration.
                                </div>-->
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
