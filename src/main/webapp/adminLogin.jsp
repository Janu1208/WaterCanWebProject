<html>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jQuery.min.js"></script>

<body>
<jsp:include page="headers.jsp"></jsp:include><br>
<script type="text/javascript">
function adminlogin()
{
	event.preventDefault();
	var name=document.getElementById("name").value;
	var password=document.getElementById("password").value;
	
	var formData = "name="+ name +"&password="+ password;
    var url = "http://localhost:8080/WaterCaneWebProject/AdminServlet?" + formData;
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
    	window.location.href= "adminOperations.jsp";
    	}
       
    });
			
}
</script>
<h4> AdminLogin </h4> 
<div class="container-fluid">
        <div class="row">
            <div class="col">
<form onsubmit="adminlogin()" >
Name: 
<input type="text" name="name" id="name" placeholder="Enter your name" required autofocus />  
Password: 
<input type="password" name="password" id="password" placeholder="Enter password" required autofocus/> <br>
<input type="submit"  value="Submit" class="btn btn-success"  ><br>
</form>
</div>
</div>
</div>
</body>
</html>