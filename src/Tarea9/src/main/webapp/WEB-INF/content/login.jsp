<%-- 
    Document   : saludos
    Created on : 20 nov. 2021, 12:11:43
    Author     : richartl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="index.title" /></title>
    </head>
    <body>
        
        <h1><s:text name="index.hello-world"/></h1>
        
        <s:form action="validate">          
            <s:textfield name="user" key="user"/>
            <s:password name="password" key="password"/>
            <s:submit key="login.button" name="submit" />
        </s:form>
        
    </body>
</html>
