<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 23/06/2022
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp" %>
<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form action="/register" method="post" modelAttribute="user">

        <div class="form-group">
            <input type="text" name="userName" placeholder="Nazwa użytkownika"/>
        </div>
        <div class="form-group">

            <input type="email" name="email" placeholder="Email"/>
        </div>
        <div class="form-group">
            <input type="text" name="role" placeholder="Rola"/>
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Hasło"/>
        </div>


        <div class="form-group form-group--buttons">
<%--            <a href="/login" class="btn btn--without-border">Zaloguj się</a>--%>
            <button class="btn" type="submit">Potwierdź</button>
        </div>
    </form:form>
</section>
<%@include file="footer.jsp" %>
</body>
</html>
