<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop Home - Where everything is fresh!</title>
    </head>
    <body>
        <div class="container-fluid">
                <div class="container-fluid">
                    <div class="page-header">
                        <h1 class="form-heading">Welcome to BuCoop, where everything is fresh!</h1>
                    </div>
                    <div class="span5 container">
                            <h3>Latest Products</h3>
                            <c:forEach items="${productList}" var="productList">
                                <c:if test="${productList.productactive}">

                                        <div class="well container-fluid">
                                            <div class="container-fluid">
                                            <h4><c:out value="${productList.productname}"/></h4>
                                            <c:out value="${productList.productdesc}"/>
                                            </div>
                                            <div class="container-fluid">
                                                <div class="span6 pull-left">
                                                    Category: <c:out value="${productList.categoryname}"/>
                                                </div>
                                                <div class="span6 pull-right">
                                                    Producer: <c:if test="${producerList.produceractive}"><c:out value="${productList.producername}"/></c:if>
                                                </div>
                                            </div>
                                        </div>
                                    
                                </c:if>
                            </c:forEach>
                        
                    </div>
                    <div class="span5 container">
                        
                            <h3>Announcements</h3>
                            <c:forEach items="${announcementList}" var="announcementList">
                                <c:if test="${announcementList.active}">
                                    <div class="row-fluid">
                                        <div class="well container-fluid">
                                            <div class="container-fluid">
                                            <h4><c:out value="${announcementList.announcementtitle}"/></h4>
                                            <c:out value="${announcementList.announcementbody}"/>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </c:forEach>
                        
                    </div>
                </div>

        </div>
    </body>
</html>
