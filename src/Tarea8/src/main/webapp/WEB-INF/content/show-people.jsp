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
        <title>Show People</title>
    </head>
    <body>
        <s:form>
            <s:textfield name="name"/>
            <s:submit value="Send"/>
        </s:form>
        
        
        <p>Name: <s:property value="name" /> </p>
    </body>
</html>
