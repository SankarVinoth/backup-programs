
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-CommerceApp</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<h3> Edit Product Details</h3>
	<% String productId=request.getParameter("productId"); %>
<form  action="" method="post">
 

<label>ProductName</label>
<input type="text"  name="productName" placeholder="Enter ProductName" required ><br/>
<label>ProductId</label>
<input type="text"  name="productid" placeholder="Enter ProductId" required ><br/>
<label>Category</label>
<input type="text"  name="productcategory" placeholder="Enter product category" required ><br/>
<label>Price of the Product</label>
<input type="number"  name="productPrice" placeholder="Enter ProductPrice" required > <br/>
<label>Quantities available</label>
<input type="number"  name="productquantity" placeholder="Enter no.of.Quantity" required > <br/>
<label>Status of product</label>
<select name="status">
<option value="available">available</option>
<option value="not available">not available</option>
</select><br/>

<a href=""><input type="button" class="btn btn-primary" value="Save"></a>
<a href=""><input type="button" class="btn btn-danger" value="cancel"></a>
</form>

</body>
</html>