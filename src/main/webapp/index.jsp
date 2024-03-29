<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
<jsp:include page="./style/style.jsp">
    <jsp:param name="pageColor" value="#04AA6D;" />
</jsp:include>
</style>
</head>
<body>
    <h2>${initParam.AppName}</h2>
    <c:set var="pageLink" scope="application" value="Home/<a href='index.jsp'>Login</a>/Register" />
    <c:choose>
        <c:when test='${sessionScope.loggedInId ne null}' >
            <c:redirect url="./home" />
        </c:when>
        <c:otherwise>
            <span style="font-weight:bold;font-size:16px;">Login</span>
            <form action="./login" method="post">

              <jsp:useBean id="loginForm" class="com.bavon.app.userbean.LoginForm" scope="page"/>

              <div class="container">
                <label for="username"><b>Username</b></label>
                <input type="text" placeholder="${loginForm.usernamePlaceHolder}" name="username" required>

                <label for="password"><b>Password</b></label>
                <input type="password" placeholder="${loginForm.passwordPlaceHolder}" name="password" required>

                <button type="submit">Login</button>
              </div>

              <div class="container">
                <span class="psw">Reset <a href="resetpwd.jsp">password?</a></span>
              </div>
            </form>

            <span style="font-weight:bold;font-size:13px;color:red;">Dont Have An member? <a href="register.jsp">Register</a></span>

        </c:otherwise>
    </c:choose>
</body>
</html>
