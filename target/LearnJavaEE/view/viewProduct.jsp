<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>

    </style>
</head>
<body>
<c:if test="${products!= null}">
 <table>
       <tr>
        <th>Name</th>
        <th>Description</th>

    </tr>
    <c:forEach items="${products}" var="product">
    <tr>
        <td>${product.name}</td>
        <td>${product.description}</td>
        <td><a href="update-product?productId=${product.id}" role="button" class="btn btn-primary">Edit</a></td>

    </tr>
    </c:forEach>
    <%--<tr>
        <td></td>
        <td></td>

    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>

    </tr>
    <tr>

        <td></td>
        <td></td>
    </tr>
    <tr>

        <td></td>
        <td></td>
    </tr>--%>
</table>
</c:if>
</body>
</html>