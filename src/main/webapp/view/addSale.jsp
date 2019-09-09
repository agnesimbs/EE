<%--
  Created by IntelliJ IDEA.
  User: Imbs
  Date: 9/9/2019
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div >
    <form action="addSale"method="post">
        <label for="quantity">Quantity</label>
        <input type="text" id="quantity" name="quantity">
        <label for="sellingprice">SellingPrice</label>
        <input type="text" id="sellingprice" name="sellingprice">
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
