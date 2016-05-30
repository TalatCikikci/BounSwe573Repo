<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                        <input id="profileFirstName" type="text" name="firstname" value="<c:out value="${sessionFirstName}"/>" readonly>
                                    </div>
                                </div>
                                    
                                <div class="control-group">
                                    <label class="control-label" for="profileLastName">
                                        Last Name
                                    </label>

                                    <div class="controls">
                                        <input id="profileLastName" type="text" name="lastname" value="<c:out value="${sessionSurname}"/>" readonly>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileEmail">
                                        E-Mail
                                    </label>

                                    <div class="controls">
                                        <input id="profileEmail" type="text" name="email" value="<c:out value="${sessionEmail}"/>" readonly>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="profileAbout">
                                        About
                                    </label>

                                    <div class="controls">
                                        <textarea id="profileAbout" rows="5" type="text" name="about" readonly><c:out value="${sessionAbout}"/></textarea>
                                    </div>
                                </div>
                        </div>
                    </div>
                    <div class="span6">
                        <c:if test="${sessionAvatar==null}">
                            <img src="http://placehold.it/750x500" alt="Profile Image" class="img-responsive">
<!--                            <form method="POST" action="<c:url value='/upload' />"
                                enctype="multipart/form-data">
                                Please select a file to upload : <input type="file" name="file" />
                                <input type="submit" value="upload" />
                            </form>-->
                        </c:if>
                        <c:if test="${sessionAvatar!=null}">
                            <img  value="<c:out value="${sessionAvatar}"/>" alt="">
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
