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
        <title>Login</title>
    </head>
    <body>
        <h1><s:property value="title" /></h1>
        <s:form>
            <s:textfield name="user" key="user"/>
            <s:password name="password" type="password" key="password"/>
            <s:submit key="login.button" name="submit" />
        </s:form>
        
        
        <p><s:property value="results" /> </p>
        <p>User: <s:property value="user" /> </p>
        <p>Password: <s:property value="password" /> </p>
    </body>
</html>
