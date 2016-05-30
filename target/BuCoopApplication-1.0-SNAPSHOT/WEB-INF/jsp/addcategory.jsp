<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Admin Console - Category</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="page-header">
                        <h1 class="form-heading">Add Category</h1>
                    </div>
                    <div class="span3">
                        <div class="well sidebar-nav">
                            <ul class="nav nav-list">
                                <li class="nav-header">Administrative Tools</li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/useradmin" />">Users</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/useradmin" />">List Users</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/requestadmin" />">Membership Requests</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/productadmin" />">Products</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/productadmin" />">List Products</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/addproduct" />">Add Products</a>
                                        </li>
                                        <li>
                                        <a href="<c:url value="/categoryadmin" />">List Categories</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/addcategory" />">Add Categories</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/produceradmin" />">Producers</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/produceradmin" />">List Producers</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/addproducer" />">Add Producers</a>
                                        </li>
                                    </ul>                    
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/announcementadmin" />">Announcements</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/announcementadmin" />">List Announcements</a>
                                        </li>
                                        <li>
                                        <a href="<c:url value="/addannouncement" />">Add Announcements</a>
                                        </li>
                                    </ul>                    
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="area">
                            <form class="form-horizontal" method="post" role="form" action="${pageContext.servletContext.contextPath}/addcategory">

                                <div class="control-group">
                                    <label class="control-label" for="inputCategoryname">Category Name</label>

                                    <div class="controls">
                                        <input id="inputCategoryname" placeholder="E.g. Cheese" type="text" name="categoryname">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <div class="controls"> <button class="btn btn-success" type="submit">Add</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
