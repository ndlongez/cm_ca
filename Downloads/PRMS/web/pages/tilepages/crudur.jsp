<%-- 
    Document   : crudur
    Created on : Sep 15, 2016, 10:52:03 PM
    Author     : longnguyen
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <fmt:setBundle basename="ApplicationResources" />

        <title><fmt:message key="title.crudur" /></title>
    </head>
    <body>
        <h1><fmt:message key="label.crudur"/></h1>
        <table class="borderAll">
            <tr>
                <th><fmt:message key="label.crudur.id"/></th>
                <th><fmt:message key="label.crudur.name"/></th>
                <th><fmt:message key="label.crudur.role"/></th>
                <th><fmt:message key="label.crudur.edit"/> <fmt:message key="label.crudur.delete"/></th>
            </tr>    
            <c:forEach var="crudur" items="${urs}" varStatus="status">
                <tr class="${status.index%2==0?'even':'odd'}">
                    <td class="nowrap">${crudur.id}</td>
                    <td class="nowrap">${crudur.name}</td>
                    <td class="nowrap">
                        <c:forEach var="roles" items="${crudur.roles}">
                            ${roles.role}:
                        </c:forEach>
                    </td>
                    <td class="nowrap">                        
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
