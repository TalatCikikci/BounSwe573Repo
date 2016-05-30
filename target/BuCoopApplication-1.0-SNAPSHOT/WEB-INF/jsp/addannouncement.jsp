<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Admin Console - Announcement</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="page-header">
                        <h1 class="form-heading">Add Announcement</h1>
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
                            <form class="form-horizontal" method="post" role="form" action="${pageContext.servletContext.contextPath}/addannouncement">

                                <div class="control-group">
                                    <label class="control-label" for="inputProducername">Announcement Title</label>

                                    <div class="controls">
                                        <input id="inputProducername" placeholder="E.g. Yumurtam Sıcak!" type="text" name="announcementtitle">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="inputDesc">Announcement Body</label>

                                    <div class="controls">
                                        <textarea id="inputDesc" placeholder="E.g. Description / Date&Time / Place..." type="text" name="announcementbody"></textarea>
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
