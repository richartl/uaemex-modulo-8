<%-- 
    Document   : saludos
    Created on : 20 nov. 2021, 12:11:43
    Author     : richartl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <s:text name="welcome.title" /> </title>
    </head>
    <body>
        <h1><s:text name="welcome.title" /></h1>
        <p><s:text name="welcome.message" /></p>

        <p>User: <s:property value="user" /></p>
        <p>Pass: <s:property value="password" /></p>
       
    </body>
</html>
