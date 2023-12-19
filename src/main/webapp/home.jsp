<%@ page import = "com.asule.view.toolbar.Navbar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "com.asule.view.toolbar.Footer" %>
<%@ page import = "com.asule.utils.CookieUtils" %>
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>
    <jsp:include page="./app/css/AppCss.jsp">
        <jsp:param name="buttonColor" value="rgb(0, 53, 133)" />
    </jsp:include>
</head>

<body>

    <%-- Accessing cookie set during user login --%>
    <%
        Cookie userCookie = CookieUtils.getCookieByName(request, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }
    %>

    <jsp:useBean id="navbarBean" class="com.asule.usebean.NavbarBean" />
    <jsp:useBean id="contentHtmlRender" class="com.asule.usebean.ContentBean" scope="request" />
    <jsp:useBean id="footerMenuContent" class="com.asule.usebean.FooterBean" />
    <jsp:setProperty name="contentHtmlRender" property="content" value='${requestScope.content}' />

    <% navbarBean.generateMenu(firstLetter); %>
    <% footerMenuContent.generateFooterMenu(); %>

    ${navbarBean.menu}

    <div class="mainContainer">
        <div class="heroSection">
            <div class="sectionTitle">
                <p>
                    Elevate Your <br />
                    <span class="blueText">Workout Experience </span> <br />
                    Like Never Before
                </p>
            </div>
            <div>
                <p class="summary">
                    Experience the ultimate in workout entertainment with our seamless
                    Membershiping system. Get ready to elevate your fitness journey to the
                    next level.
                </p>
            </div>
            <div class="homeButtons">
                <a href="./Memberships" class="homeOutlineButton"> My Memberships</a>
                <a href="./Members" class="homeNormalButton">Upcoming Workouts</a>
            </div>
        </div>
        <div class="heroImage">
            <div class="imageContainer">
                <img class="bgImage"
                    src="https://wallpapercave.com/dwp1x/wp10614086.jpg"
