%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Profile</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="span6">
                        <div class="area">
                                
                                <div class="page-header">
                                    <h1 class="form-heading">Profile Page of ${sessionUser} <button class="btn btn-mini"><a href="${pageContext.servletContext.contextPath}/editprofile" class="navbar-link">Edit</a></button></h1>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileFirstName">
                                        First Name
                                    </label>

                                    <div class="controls">
                                        <input id="profileFirstName" type="text" name="firstname" readonly>
                                    </div>
                                </div>
                                    
                                <div class="control-group">
                                    <label class="control-label" for="profileLastName">
                                        Last Name
                                    </label>

                                    <div class="controls">
                                        <input id="profileLastName" type="text" name="lastname" readonly>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileEmail">
                                        E-Mail
                                    </label>

                                    <div class="controls">
                                        <input id="profileEmail" type="text" name="email" readonly>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileAbout">
                                        About
                                    </label>

                                    <div class="controls">
                                        <textarea id="profileAbout" rows="5" type="text" name="about" readonly></textarea>
                                    </div>
                                </div>
                        </div>
                    </div>
                    <div class="span6">

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
