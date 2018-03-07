<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<form action="issueBook" method="POST">

<select name="userId">
	<option value="">Choose User</option>
	<c:forEach items="${userList}" var="user">
		<option value="${user.id}">${user.firstName}</option>
	</c:forEach>
</select>

<select name="bookId">
	<option value="">Choose Book</option>
	<c:forEach items="${bookList}" var="book">
		<option value="${book.id}">${book.bookName}</option>
	</c:forEach>
</select>


<input type="submit" value="Submit">
</form>

</body>
</html>