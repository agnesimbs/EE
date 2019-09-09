<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
  <link rel="stylesheet" type="text/css" href="styles.css">j
  <style>
  * {
  box-sizing: border-box;
  }

  /* Create two equal columns that floats next to each other */
  .column {
  float: left;
  width: 50%;
  padding: 10px;
  /*height: 300px; /* Should be removed. Only for demonstration */
  }

  /* Clear floats after the columns */
  .row:after {
  content: "";
  display: table;
  clear: both;
  }

  /* Responsive layout - makes the two columns stack on top of each other instead of next to each other */
  @media screen and (max-width: 600px) {
  .column {
  width: 100%;
  }}

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
<div class="row">
  <div class="column" style="background-color:#aaa;">

    <div >
      <form action="addProduct"method="post">
        <label for="productName">Name</label>
        <input type="text" id="productName" name="productName">

        <label for="productDescription">Description</label>
        <input type="text" id="productDescription" name="productDescription">

        <input type="submit" value="Submit">
      </form>
    </div>
  </div>
  <div class="column" style="background-color:#bbb;">

   <%-- <c:if test="${products!= null}">
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

      </table>
    </c:if>--%>
     <c:import var="data" url="viewProduct.jsp"/>
     <c:out value="${data}"/>

  </div>
</div>
<!---->

</body>
</html>