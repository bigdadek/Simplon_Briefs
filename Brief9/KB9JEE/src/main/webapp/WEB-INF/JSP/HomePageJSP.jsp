 <%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<title> KB ^_^ </title>
	</head>
	
	<body>
		
		<div id="div1">
		
				<table>
					<tr> 
						<th> Title </th>
						<th> Status </th>
						<th> DeadLine </th>
					</tr>
					
					<c:forEach items="${Lists}" var="List">
						<tr> 
							<th><c:out value="${List.getTitle()}"/></th> 
							<th><c:out value="${List.stutas}"/></th> 
							<th><c:out value="${List.date}"/></th> 
						</tr>
					</c:forEach>
			</table>
			<input type="submit" value="Create list" id="btnSignUp" name="btn" onclick="SignUpServlet"/> <br/>
			<input type="submit" value="log out" id="btnLogin" name="btn" onclick="btnLogIn()"/> <br/>
	</div>
		
	</body>
</html>
			