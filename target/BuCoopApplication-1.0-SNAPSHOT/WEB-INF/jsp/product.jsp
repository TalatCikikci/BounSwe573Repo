<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Product</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container-fluid">
                <c:if test="${productPage.productactive}">                
                    <div class="page-header">
                        <h1 class="form-heading"><c:out value="${productPage.productname}"/></h1>
                    </div>
                    <div class="span9 container">
                        <h3>Description</h3>
                        <div class="well container-fluid">
                            <div class="container-fluid">
                            <c:out value="${productPage.productdesc}"/>
                            </div>
                            <div class="container-fluid">
                                <div class="span6 pull-left">
                                    Category: <c:out value="${productPage.categoryname}"/>
                                </div>
                                <div class="span6 pull-left">
                                    Producer: <a href="producer?<c:out value="${productPage.producerid}"/>"><c:out value="${productPage.producername}"/></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
    </body>
</html>

