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
			<form method='post' action='CreateListServlet' >
				<label for="title"> Title :</label> <br/>
				<input type="text" id="title" name="title" placeholder="Title" required/> <br/>
			
				<label for="descreption"> Description :</label> <br/>
				<textarea id="descreption" name="descreption" placeholder="Description" > </textarea> <br/>
					
				<label for="categories"> Categories :</label> <br/>
				<!-- 
				<select id="categories" name="categories" required>
					<c:forEach items="${Catgs}" var="categ">
						<option> <c:out value="${Categ}"/> </option>
					</c:forEach>
					
				</select><br/>
				  -->
				<select id="categories" name="categories" required>
					<option>  Books </option>
					<option>  Events </option>
					<option>  Family </option>
					<option>  Friends </option>
					<option>  Grocery </option>
					<option>  Movies </option>
					<option>  Research </option>
					<option>  School </option>
					<option>  Work </option>
					<option>  Other ...</option>
				</select><br/>
				
				<label for="status"> Status :</label> <br/>
				<select id="status" name="status" required>
					<option> To Do </option>
					<option> Doing </option>
					<option> Done </option>
				</select><br/>
				
				<label for="date"> DeadLine :</label> <br/>
				<input type="date" value="2022-07-01" name="date" required/> <br/>
				
				<input type="submit" value="save" id="btnSignUp" name="btn" onclick="/HomePageServlet"/> <br/>
				<input type="submit" value="Exit" id="btnLogin" name="btn" onclick="btnLogIn()"/> <br/>
				
			</form>
		</div>
		
	</body>
</html>