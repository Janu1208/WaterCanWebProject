<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jQuery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="adminOpHeader.jsp"></jsp:include><br>
<script type="text/javascript">
function reset()
{
	window.location.href = "updateStock.jsp";

}
function updatestock()
{
	event.preventDefault();
	var cansdetails = document.getElementById("cans").value;
	
	var formData = "cans=" +cansdetails;

    var url = "http://localhost:8080/WaterCaneWebProject/UpdateStock?" + formData;
    console.log(url);
    $.get(url, function(response){
    console.log(response);
    var data= response;
    
    if ( data.errorMessage != null) {
    	alert(data.errorMessage);
    }
    else
    	{
    	//alert(data.message);
    	alert("Cans added succesfully");
    	window.location.href= "adminOperations.jsp";
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
<form onsubmit="upatestock()" >
Set Available Cans: 
<input type="text" id="cans" name="cans" placeholder="Enter the cans" required autofocus  /> <br>
<button type="submit"  value="Submit" class="btn btn-success" onclick="updatestock()">submit</button>
<button type="reset"  value="Reset" class="btn btn-danger" >Clear</button>
</form>
</body>
</html>