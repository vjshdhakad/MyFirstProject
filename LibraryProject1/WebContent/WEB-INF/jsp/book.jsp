<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body{
background-color:grey;
}
h1{
color:red;
margin-left:50px;
margin-bottom:30px;
}
h2{
color:yellow;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello student</title>
</head>
<body>
<form action="saveBook" method="POST">
Book Id<input type="text" name="id"><br>
Book Name<input type="text" name="bookName"><br>
Author Name<input type="text" name="authorName"><br>
Book Addition<input type="text" name="bookAddition"><br>
Book Quantity<input type="text" name="bookQuantity"><br>
<input type="submit" value="submit">
</form>

</body>
</html>