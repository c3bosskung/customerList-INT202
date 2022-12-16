<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 12/16/2022
  Time: 12:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<H1 style="color: deepskyblue" class="container">64130500099 Natdanai Nitipan</H1>
<hr>
    <c:forEach items="${customerList}" var="customer">
    <div class="container">
    <div class="row">
        <div class="col">099-${customer.customerNumber}</div>
        <div class="col">${customer.customerName}</div>
        <div class="col">${customer.city}</div>
        <div class="col">${customer.country}</div>
        <div class="col">${customer.phone}</div>
        <div class="col">${customer.role}</div>
    </div>
    </div>
    </c:forEach>
</body>
</html>
