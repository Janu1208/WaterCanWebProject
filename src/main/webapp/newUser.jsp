<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include><br>
<script type="text/javascript">

function register()
{
alert("Registration successfull");
window.location.href = "login.jsp";
}
register(name,phone_number,password)
{
	var formData = "name=" +name + "&phone_number="+ phone_number +"&password="+ password;

}
function reset()
{
	window.location.href = "newUser.jsp";
}
</script>
<%
String errorMessage = request.getParameter("errorMessage");
if(errorMessage!=null){
	out.println("<font color='red'>" + errorMessage + "</font>");
}
%>
<h3>Welcome to Register page</h3>
<h3>Register</h3>



<form action="RegServlet" >


<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<br/>
<label>Mobile_Number:</label>
<input type="tel" name="phone_number" id="phone_number" placeholder="Enter phone_number" required  />
<br/>
<label>Password:</label>
<input type="password" name="password" id="password" placeholder="Enter Password"  required />
<br/>

<input type="submit"  value="Submit" class="btn btn-success" onclick "register()"/>
<input type="button"  value="Reset" class="btn btn-danger" onclick="reset()">
</form>
</body>
</html>