<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <meta name="viewport" content="width=device-width, initial-scale=1.0" >
        <meta name="description" content="BuCoop - Food cooperation portal for Bogazici University" >
        <meta name="author" content="Talat Cikikci" >

        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/leaflet/leaflet.css"/>"/>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/leaflet.search/leaflet-search.min.css"/>"/>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/leaflet.draw/leaflet.draw.css"/>"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/Site.css"/>"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="<c:url value="/resources/js/transitions.js"/>"></script>
        <script src="<c:url value="/resources/js/respond.js"/>"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.13.9/jquery.mask.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?v=3&sensor=false"></script>
        <script src="<c:url value="/resources/leaflet/leaflet.js"/>"></script>
        <script src="<c:url value="/resources/leaflet.search/leaflet-search.min.js"/>"></script>
        <script src="<c:url value="/resources/leaflet.draw/leaflet.draw.js"/>"></script>
        <script src="<c:url value="/resources/js/modernizr.js"/>"></script>
        <script src="<c:url value="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.4/jquery-ui.js"/>"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.4/jquery-ui.css">

        <title>
            <dec:title default="mvc-java-init" />
        </title>
        
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        
        <style type="text/css">
            body {
                padding-top: 60px;
                padding-bottom: 40px;
                }
            .sidebar-nav {
                padding: 9px 0;
                }
        </style>
        
        <!-- See http://twitter.github.com/bootstrap/scaffolding.html#responsive -->
        <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet" >

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- Fav and touch icons 
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="resources/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="resources/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="resources/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="resources/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="resources/ico/favicon.png">
        -->

        <dec:head />
    </head>
    
    <body>
        <%@include file="header.jsp"%>
        <div id="message" class="alert alert-info">
            
        </div>
 
        <div class="container-fluid">
            <div class="row-fluid">
<!--                <div class="span3">
                    <div class="well sidebar-nav">
                        <ul class="nav nav-list">
                            <li><p>List Here</p></li>
                        </ul>
                    </div>
                </div> /span-->
                
                <div class="span9">
                    <!--Body content-->
                    <dec:body />
                </div>
            </div>
            <hr>
            <%@include file="footer.jsp"%>
        </div><!--/.container-fluid-->
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>