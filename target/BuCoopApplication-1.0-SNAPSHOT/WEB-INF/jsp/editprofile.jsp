<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <form class="form-horizontal" method="post" role="form" action="${pageContext.servletContext.contextPath}/editaction">
                                
                                <div class="page-header">
                                    <h1 class="form-heading">Profile Page of ${sessionUser}</h1>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileFirstName">
                                        First Name
                                    </label>

                                    <div class="controls">
                                        <input id="profileFirstName" type="text" name="firstname">
                                    </div>
                                                               
                                    <div class="controls">
                                        <label class="checkbox">
                                            <input type="checkbox" name="profileVisible">
                                            Private?
                                        </label>
                                    </div>
                                </div>
                                    
                                <div class="control-group">
                                    <label class="control-label" for="profileLastName">
                                        Last Name
                                    </label>

                                    <div class="controls">
                                        <input id="profileLastName" type="text" name="lastname">
                                    </div>
                                    
                                    <div class="controls">
                                        <label class="checkbox">
                                            <input type="checkbox" name="profileVisible">
                                            Private?
                                        </label>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileEmail">
                                        E-Mail
                                    </label>

                                    <div class="controls">
                                        <input id="profileEmail" type="text" name="email">
                                    </div>
                                                                        
                                    <div class="controls">
                                        <label class="checkbox">
                                            <input type="checkbox" name="profileVisible">
                                            Private?
                                        </label>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileAbout">
                                        About
                                    </label>

                                    <div class="controls">
                                        <textarea id="profileAbout" rows="5" type="text" name="about"></textarea>
                                    </div
                                </div>

                                <div class="control-group">
                                    <div class="controls"> <button class="btn btn-success" type="submit">Save</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="span6">

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>