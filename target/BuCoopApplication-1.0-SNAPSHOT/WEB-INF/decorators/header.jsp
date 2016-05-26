<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="<c:url value="/" />">BuCoop</a>
                    <div class="nav-collapse collapse">
                        <p class="navbar-text pull-right">
                            <c:if test="${not empty sessionUser}">
                                Logged in as <a href="${pageContext.servletContext.contextPath}/profile" class="navbar-link"><c:out value="${sessionUser}"/></a>
                            </c:if>
                        </p>
                        <ul class="nav">
                            <li class="active"><a href="<c:url value="/" />">Home</a></li>
                            <li><a href="<c:url value="/login" />">Login</a></li>
                            <li><a href="<c:url value="/signup"/>">Sign Up</a></li>
                            <li><a href="<c:url value="/adminconsole"/>">Console</a></li>
                        </ul>
                        <form class="navbar-form">
                            <div class="form-group" style="display:inline;">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search...">
                                     <button class="btn">Search</button>
                                 </div>
                            </div>
                        </form>        
                    </div> <!--/.nav-collapse -->
                </div>
            </div>
        </div>
    </body>
</html>
