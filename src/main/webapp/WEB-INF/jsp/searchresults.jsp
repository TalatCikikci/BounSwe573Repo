<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Search Results</title>
    </head>
    <body>
        <h1>Search Results for ${searchitem}</h1>
        <div class="span12">
            <div class="span6">
                <h4>Product Results</h4>
                <p><i>*Includes products that have the keyword in product name, product description, producer name, producer description and product category.</i></p>
                <div class="area">
                    <div class="table-responsive">
                        <table class="table table-hover table-bordered table-striped">
                          <thead>
                                <tr>
                                    <th>Product Name</th>
                                    <th>Category</th>
                                    <th>Producer</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${productList}" var="productList">
                                    <tr>
                                        <td><a href="/product/<c:out value="${productList.id}"/>"><c:out value="${productList.productname}"/></a></td>
                                        <td><c:out value="${productList.categoryname}"/></td>
                                        <td><c:out value="${productList.producername}"/></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="span6">
                <h4>Producer Results</h4>
                <p><i>*Includes producers that have the keyword in producer name and producer description.</i></p>
                <div class="area">
                    <div class="table-responsive">
                        <table class="table table-hover table-bordered table-striped">
                          <thead>
                                <tr>
                                    <th>Producer Name</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${producerList}" var="producerList">
                                    <tr>
                                        <td><a href="/producer/<c:out value="${producerList.id}"/>"><c:out value="${producerList.producername}"/></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
