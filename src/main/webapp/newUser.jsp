<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jQuery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include><br>
<script type="text/javascript">

function reset()
{
	window.location.href = "newUser.jsp";
}

function register()
{
	event.preventDefault();
	var name = document.getElementById("name").value;
	var phone_number=document.getElementById("phone_number").value;
	var password=document.getElementById("password").value;
	
	var formData = "name=" +name + "&phone_number="+ phone_number +"&password="+ password;

    var url = "http://localhost:8080/WaterCaneWebProject/RegServlet?" + formData;
    console.log(url);
    $.get(url, function(response){
    console.log(response);
    var data= JSON.parse(response);
    
    if ( data.errorMessage != null) {
    	alert(data.errorMessage);
    }
    else
    	{
    	alert(data.message);
    	alert("successfully registered");
    	window.location.href= "ulogin.jsp";
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
<h3>Welcome to Register page</h3>
<h3>Register</h3>



<form onsubmit="register()">


<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<br/>
<label>Mobile_Number:</label>
<input type="tel" name="phone_number" id="phone_number" placeholder="Enter phone_number" required  />
<br/>
<label>Password:</label>
<input type="password" name="password" id="password" placeholder="Enter Password"  required />
<br/>

<input type="submit"  value="Submit" class="btn btn-success" />
<input type="button"  value="Reset" class="btn btn-danger" onclick="reset()">
</form>
</body>
</html>