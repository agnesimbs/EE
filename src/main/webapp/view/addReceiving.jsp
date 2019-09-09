<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>

        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 40px;
        }
    </style>
</head>
<body>
<ul>

    <li class="dropdown">
        <a href="#" class="dropbtn">Product</a>
        <div class="dropdown-content">
            <a href="#">AddProduct</a>
            <a href="#">ViewProduct</a>
            <a href="#">UpdateProduct</a>
            <a href="#">DeleteProduct</a>
        </div>
    </li>
    <li><a href="receiving.html">Receiving</a></li>
    <li><a href="sale.html">Sale</a></li>
    <li><a href="report.html">Reports</a></li>

</ul>
<h3> Form</h3>

<div >
    <form action="addReceiving"method="post">
        <label for="batchno">BatchNumber</label>
        <select id="batchno" name="batchno">
            <!--<option value="australia">Australia</option>
           <option value="canada">Canada</option>
            <option value="usa">USA</option>-->
        </select>
        <label for="quantity">Quantity</label>
        <input type="text" id="quantity" name="quantity">
        <%--<label for="buyingprice">BuyingPrice</label>
        <input type="text" id="buyingprice" name="buyingprice">
        <label for="sellingprice">SellingPrice</label>
        <input type="text" id="sellingprice" name="sellingprice">--%>





        <input type="submit" value="Submit">
    </form>
</div>

</body>

</html>
