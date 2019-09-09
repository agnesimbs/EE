<%--
  Created by IntelliJ IDEA.
  User: Imbs
  Date: 9/9/2019
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        /*STYLING TABLE*/
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>

</head>
<body>
<c:if test="${sales!= null}">
    <th>Quantity</th>
    <table>
        <tr>
            <th>SellingPrice</th>

        </tr>
        <c:forEach items="${sales}" var="sale">
            <tr>
                <td>${sale.quantity}</td>
                <td>${sale.sellingPrice}</td>
                <td><a href="update-product?productId=${product.id}" role="button" class="btn btn-primary">Edit</a></td>

            </tr>
        </c:forEach>

    </table>
</c:if>


</body>
</html>
