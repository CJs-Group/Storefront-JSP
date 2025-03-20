<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Storefront</title>
</head>
<body style="background-color: <%= request.getParameter("colour") %>;">
    <h1>Welcome to Storefront!</h1>
    <p>Explore our wide range of products and enjoy your shopping experience.</p>
    <a href="products.jsp">View Products</a>
    <p>Your name is <%= request.getParameter("name") %></p>
    <p>Your email is <%= request.getParameter("email") %></p>
    <p>Your password is <%= request.getParameter("password") %></p>
</body>
</html>