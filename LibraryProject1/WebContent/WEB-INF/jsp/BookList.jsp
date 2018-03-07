<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getBookById" method="get">
Search Id<input type="text" name="id">
<input type="submit" value="search">
</form>
<table>
	<thead>
	    <tr>
	        <th> Id</th>
	        <th> BookName</th>
	        <th> AuthorName</th>
	        <th> Addition</th>
            <th> Quantity</th>
	    </tr>
	    
	    <c:forEach items="${BookList}" var="user">
       
       <tr>
           <td>${book.id}</td>
           <td>${book.bookName}</td>
           <td>${user.authorName}</td>
           <td>${user.eddition}</td>
           <td>${user.quantity}</td>
        
       </tr>
       </c:forEach>     
       
    </thead>
</table>
</body>
