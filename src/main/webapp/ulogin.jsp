<html>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jQuery.min.js"></script>
<body>
<jsp:include page="headers.jsp"></jsp:include><br>
<script type="text/javascript">

function login()
{
	event.preventDefault();
	var phone_number=document.getElementById("phone_number").value;
	var password=document.getElementById("password").value;
	
	var formData = "phone_number="+ phone_number +"&password="+ password;
    var url = "http://localhost:8080/WaterCaneWebProject/UserLogServlet?" + formData;
    console.log(url);
    $.get(url, function(response){
    console.log(response);
    var data= JSON.parse(response);
    
    if ( data.errorMessage != null) {
    	alert(data.errorMessage);
    }
    else
    	{
    	//alert(data.message);
    	alert("Login Succesfull");
    	window.location.href= "userOperations.jsp";
    	}
       
    });
			
}
</script>
<%
String errorMessage = request.getParameter("errorMessage");
if(errorMessage!=null){
	out.println("<font color='red'>" + errorMessage + "</font>");
}
%>

<h2>Welcome to Login Page</h2>
<div class="container-fluid">
        <div class="row">
            <div class="col">

<form onsubmit="login()" >
	Mobile Number: 
	<input type="text" name="phone_number" id="phone_number" placeholder="Enter phone_number" required autofocus />  
	Password: 
	<input type="password" name="password" id="password" placeholder="Enter Password"  required /> <br>
	<input type="submit"  value="Submit" class="btn btn-primary" onclick="login()"><br>
</form>
New User ?  <a href="newUser.jsp" class="btn btn-success">Register</a>
</div>
</div>
</div>

</body>
</html>