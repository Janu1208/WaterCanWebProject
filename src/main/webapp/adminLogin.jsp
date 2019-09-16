<html>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<body>
<jsp:include page="headers.jsp"></jsp:include><br>
<script type="text/javascript">
function login()
{
	if(admin!=null) {
		alert("Login successfull");    
    }
	else
		{
		alert("invalid details");
		window.location.href = "adminLogin.jsp";

		}
	
	console.log("AdminService-login");
	var formData = "phone_number="+ phone_number +"&password="+ password;

}
</script>
<h2>Welcome to Login page</h2>
<h4> AdminLogin </h4> 
<form action="AdminServlet" >
Name: 
<input type="text" name="name" id="name" placeholder="Enter your name" required autofocus />  
Password: 
<input type="password" name="password" id="password" placeholder="Enter password" required autofocus/> <br>
<input type="submit"  value="Submit" class="btn btn-success" onclick="login()" ><br>
</form>
</body>
</html>