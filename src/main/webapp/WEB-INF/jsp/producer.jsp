<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Producer</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container-fluid">
                <c:if test="${producerPage.active}">                
                    <div class="page-header">
                        <h1 class="form-heading"><c:out value="${producerPage.producername}"/></h1>
                    </div>
                    <div class="span9 container">
                        <h3>Description</h3>
                        <div class="well container-fluid">
                            <div class="container-fluid">
                            <c:out value="${producerPage.producerdesc}"/>
                            </div>
                            <div class="container-fluid">
                                <div class="span6 pull-left">
                                    Location: <c:out value="${producerPage.location}"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
    </body>
</html>

