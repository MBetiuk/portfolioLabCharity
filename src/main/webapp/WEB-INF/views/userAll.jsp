<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 27/06/2022
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>ClientsList</title>
</head>
<body>

<%--<div class="slogan container container--90">--%>
<%--    <div class="slogan--item">--%>
<%--        <h1>--%>
<%--            Zacznij pomagać!<br/>--%>
<%--            Oddaj niechciane rzeczy w zaufane ręce--%>
<%--        </h1>--%>
<%--    </div>--%>
<%--</div>--%>






<%--<%@include file="header.jsp" %>--%>
<style>
    table {
        margin-bottom: 20px;
        border-spacing: 0;
        border: 1px solid lightgrey;

    }

    th, td {
        font-size: 12px;
        padding: 7px;
        border: 1px solid lightgrey;
        border-top-width: 0;
        border-left-width: 0;
    }

    body {
        font-size: 12px;
        margin: 30px;
    }

    input {
        display: block;
        /*margin-bottom: 10px;*/
        margin: 0 15px 0 15px ;
    }

    a {
        padding: 5px;
        text-decoration: none;
        color: black;
    }

    button {
        margin: 0px 15px 0px 15px;
    }
</style>
<table >
    <thead>
    <th>Nazwa użytkownika</th>
    <th>Email</th>
    <th>Rola</th>
    <th>Akcje</th>

    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><c:out value="${user.userName}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td><c:out value="${user.role}"/></td>
            <td>
                <a href="admin/update/${user.id}"> Edytuj</a>
                <a href="/#/${user.id}"> Usuń</a>
                <a href="/#/${user.id}"> ####</a>


            </td>


        </tr>



    </c:forEach>
    </tbody>
</table>
<br>
<br>
<table>
    <thead>
    <tr>
        <td>

            <a href="/#"> Dodaj admina</a>
        </td>
    </tr>
    </thead>


</table>
<%--<%@include file="footer.jsp" %>--%>
</body>
</html>
